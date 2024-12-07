package com.evilcorp.deletethisshit;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello Nigger!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String par=request.getParameter("par");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + par +"</h1>");
        out.println("</body></html>");
        out.println("<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Green Theme Page</title>\n" +
                "    <style>\n" +
                "        /* Сброс стилей по умолчанию */\n" +
                "        body, h1, p, a {\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "        }\n" +
                "        body {\n" +
                "            font-family: 'Arial', sans-serif;\n" +
                "            background: linear-gradient(135deg, #43cea2, #185a9d);\n" +
                "            color: #fff;\n" +
                "            display: flex;\n" +
                "            justify-content: center;\n" +
                "            align-items: center;\n" +
                "            height: 100vh;\n" +
                "            margin: 0;\n" +
                "            overflow: hidden;\n" +
                "        }\n" +
                "        .container {\n" +
                "            text-align: center;\n" +
                "            padding: 25px 20px;\n" +
                "            border-radius: 15px;\n" +
                "            background: rgba(0, 0, 0, 0.1);\n" +
                "            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.3);\n" +
                "            backdrop-filter: blur(8px);\n" +
                "            animation: slideIn 1.5s ease-out;\n" +
                "        }\n" +
                "        h1 {\n" +
                "            font-size: 2.8rem;\n" +
                "            margin-bottom: 10px;\n" +
                "            color: #d4ffea;\n" +
                "        }\n" +
                "        p {\n" +
                "            font-size: 1.2rem;\n" +
                "            margin-bottom: 20px;\n" +
                "        }\n" +
                "        a {\n" +
                "            display: inline-block;\n" +
                "            padding: 10px 20px;\n" +
                "            font-size: 1rem;\n" +
                "            text-decoration: none;\n" +
                "            color: #43cea2;\n" +
                "            background: #fff;\n" +
                "            border: 2px solid #43cea2;\n" +
                "            border-radius: 25px;\n" +
                "            transition: all 0.3s ease;\n" +
                "        }\n" +
                "        a:hover {\n" +
                "            background: #43cea2;\n" +
                "            color: #fff;\n" +
                "        }\n" +
                "        @keyframes slideIn {\n" +
                "            from {\n" +
                "                opacity: 0;\n" +
                "                transform: translateY(-30px);\n" +
                "            }\n" +
                "            to {\n" +
                "                opacity: 1;\n" +
                "                transform: translateY(0);\n" +
                "            }\n" +
                "        }\n" +
                "        @media (max-width: 768px) {\n" +
                "            h1 {\n" +
                "                font-size: 2rem;\n" +
                "            }\n" +
                "            p {\n" +
                "                font-size: 1rem;\n" +
                "            }\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "        <h1>Green is Life</h1>\n" +
                "        <p>Welcome to the refreshing world of green. Feel the harmony and tranquility.</p>\n" +
                "        <a href=\"#discover\">Discover More</a>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>");
    }

    public void destroy() {
    }
}