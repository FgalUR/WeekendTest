package com.evilcorp.deletethisshit;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "=higit", value = "/GITL")
public class Pidors extends HttpServlet {
    private String message;

    public void init() {
        message = "Pedicks!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        out.println("<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Beautiful Web Page</title>\n" +
                "    <style>\n" +
                "        /* Сброс стилей по умолчанию */\n" +
                "        body, h1, p, a {\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "        }\n" +
                "        body {\n" +
                "            font-family: 'Arial', sans-serif;\n" +
                "            display: flex;\n" +
                "            align-items: center;\n" +
                "            justify-content: center;\n" +
                "            height: 100vh;\n" +
                "            margin: 0;\n" +
                "            background: linear-gradient(135deg, #6a11cb, #2575fc);\n" +
                "            color: #fff;\n" +
                "            overflow: hidden;\n" +
                "        }\n" +
                "        .container {\n" +
                "            text-align: center;\n" +
                "            padding: 20px;\n" +
                "            border-radius: 15px;\n" +
                "            background: rgba(255, 255, 255, 0.1);\n" +
                "            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);\n" +
                "            backdrop-filter: blur(10px);\n" +
                "            animation: fadeIn 2s ease-in-out;\n" +
                "        }\n" +
                "        h1 {\n" +
                "            font-size: 3rem;\n" +
                "            margin-bottom: 10px;\n" +
                "        }\n" +
                "        p {\n" +
                "            font-size: 1.2rem;\n" +
                "            margin-bottom: 20px;\n" +
                "        }\n" +
                "        a {\n" +
                "            display: inline-block;\n" +
                "            padding: 10px 20px;\n" +
                "            border: 2px solid #fff;\n" +
                "            border-radius: 25px;\n" +
                "            color: #fff;\n" +
                "            text-decoration: none;\n" +
                "            font-size: 1rem;\n" +
                "            transition: all 0.3s ease;\n" +
                "        }\n" +
                "        a:hover {\n" +
                "            background: #fff;\n" +
                "            color: #6a11cb;\n" +
                "        }\n" +
                "        @keyframes fadeIn {\n" +
                "            from {\n" +
                "                opacity: 0;\n" +
                "                transform: translateY(20px);\n" +
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
                "        <h1>Welcome to My Beautiful Page</h1>\n" +
                "        <p>This is an example of a simple and elegant HTML page with CSS styling.</p>\n" +
                "        <a href=\"#explore\">Explore More</a>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>");

        response.sendRedirect("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        //RequestDispatcher dispatcher=request.getRequestDispatcher("/TestClass");
        //dispatcher.forward(request,response);

    }

    public void destroy() {
    }
}
