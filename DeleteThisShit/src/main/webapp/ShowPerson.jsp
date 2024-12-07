<%@ page import="com.evilcorp.deletethisshit.Person" %><%--
  Created by IntelliJ IDEA.
  User: Фёдор
  Date: 21.11.2024
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Person</title>
</head>
<body>
<%@ page import="com.evilcorp.deletethisshit.Person" %>
<%
    Person person = (Person) session.getAttribute("person");
%>

<p> Имя:<%= person.getName()%> </p>
<p> Возраст:<%= person.getAge()%></p>
</body>
</html>
