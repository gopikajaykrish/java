package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloWorldServlet extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head><title>Hello World!</title></head>");
    out.println("<body>");
    out.println("<h1>Hello World!</h1>");
    out.println("<p>This is a simple Java web application.</p>");
    out.println("</body></html>");
  }
}
