
package com.session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
import javax.servlet.*;


public class servlet2 extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        Cookie cookies[] = request.getCookies();
        System.out.println(cookies);
        String name="";
        Boolean Flag = false;
        
        if(cookies == null){
            out.println("<h1>Welcome new user please login to the website or create an new account</h1>");
        }
        else{
            for(Cookie c:cookies){
                System.out.println(c);
                String Tname = c.getName();
                System.out.println(Tname);
                if(Tname.equals("user_name")){
                    Flag = true;
                    name=c.getValue();
                }
            }
        }
        
        if(Flag){
        out.println("<h1>");
        out.println("hello "+name+" welcome back to the application");
        out.println("</h1>");            
        }
        else{
            out.println("<h1>Welcome new user please login to the website or create an new account</h1>");
        }
        
        

        
    }
}
