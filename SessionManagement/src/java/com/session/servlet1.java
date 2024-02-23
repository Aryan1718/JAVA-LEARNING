
package com.session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
import javax.servlet.*;


public class servlet1 extends HttpServlet{
    
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        out.println("<h1>");
        out.println("hello "+name+" welcome to the application");
        out.println("</h1>");
        out.println("<a href='servlet2'>Go to servlet2</a>");
        Cookie c = new Cookie("user_name", name);
        response.addCookie(c);
    }
}
