package com.evilcorp.deletethisshit;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.beans.PersistenceDelegate;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "main", value = "/main")
public class Main extends HttpServlet {
    private String mas;

    public void init() {
        mas = "Привет,как дела?";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        Person person = (Person) session.getAttribute("person");
        String name = request.getParameter("name");//гет параметр передаётся через запрос в ссылке
        int age = Integer.parseInt(request.getParameter("age"));
        if (person == null) {
            person = new Person();
            person.setAge(age);
            person.setName(name);
        }
        session.setAttribute("person", person);
        //
        Integer count = (Integer) session.getAttribute("count");
        if (count == null) {
            count = 1;
        }
        session.setAttribute("count", count + 1);

        //перевод на jsp файл
        RequestDispatcher dispatcher = request.getRequestDispatcher("/ShowPerson.jsp");
        dispatcher.forward(request, response);
        ///////////////////
//        out.println("<html><body>");
//        out.println("<h1>" + mas + "</h1>");
//        out.println("<h1>" + count + "-Это количество заходов на страницу" + "</h1>");
//        out.println("</body></html>");
        ////////////////////////
    }
}
