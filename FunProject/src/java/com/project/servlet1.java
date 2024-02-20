
package com.project;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class servlet1 extends HttpServlet {
    
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        
        //Where we are using parameters that are set by the end-user, and the servlet only reads them.
        int number1 = Integer.parseInt(request.getParameter("number1"));
        int number2 = Integer.parseInt(request.getParameter("number2"));
        int sum = number1+number2;
        
        //Let's set an attribute in a request object so that other servlets can access that value. 
        //This value is only set by the servlet itself because whenever the servlet runs, it will set the attribute value.
         
         request.setAttribute("sum", sum);
         
         //Now use RequestDispatcher to forward the request.
         
         RequestDispatcher rd = request.getRequestDispatcher("servlet2");
         rd.forward(request, response);
        
    }
}
