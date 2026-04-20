<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><title>Welcome</title></head>
<body>

<%
String name = request.getParameter("uname");

session.setAttribute("user", name);
session.setMaxInactiveInterval(60); // 60 sec
%>

<h2 style="color:blue;">Welcome <%= name %>!</h2>

<p>Session started successfully.</p>
<p>Your name is stored in session.</p>
<p>Session will expire in 60 seconds.</p>

<br>
<a href="second.jsp">Check Session Value</a>

</body>
</html>