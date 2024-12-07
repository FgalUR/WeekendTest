package com.evilcorp.deletethisshit;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class TestClass extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String parametr=request.getParameter("par");
        PrintWriter out =response.getWriter();
        out.println(parametr);

    }
}
