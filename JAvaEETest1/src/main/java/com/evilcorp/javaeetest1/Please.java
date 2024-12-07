package com.evilcorp.javaeetest1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet (name = "MyServlet", urlPatterns = {"/hello"})
public class Please extends HttpServlet {
    protected void doPost(jakarta.servlet.http.HttpServletRequest request,
                          jakarta.servlet.http.HttpServletResponse response) throws IOException {

    }

    protected void doGet(jakarta.servlet.http.HttpServletRequest request,
                         jakarta.servlet.http.HttpServletResponse response) throws IOException {
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>JSP - Hello World</title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<h1> Hello World! </h1>");
        pw.println("<br/>");
        pw.println("</body>");
        pw.println("</html>");
    }
}
