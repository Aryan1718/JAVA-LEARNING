
package com.project;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class servlet2 extends HttpServlet {
    
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        int number1 = Integer.parseInt(request.getParameter("number1"));
        int number2 = Integer.parseInt(request.getParameter("number2"));
        
        //here we are getting attribute using "key"
        int sum = (int)request.getAttribute("sum");
        
        int product = number1 * number2;
        
        out.println("<h1>");
        out.println("sum is "+sum);
        out.println("product is "+product);
        out.println("</h1>");
        
        //here we are including index.html to perform same task again.
        RequestDispatcher rd = request.getRequestDispatcher("index.html");
        rd.include(request, response);
        
    }
    
}
