<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><title>Add Cookie</title></head>
<body>

<%
String cname = request.getParameter("cname");
String cvalue = request.getParameter("cvalue");
int cage = Integer.parseInt(request.getParameter("cage"));

Cookie cookie = new Cookie(cname, cvalue);
cookie.setMaxAge(cage);

response.addCookie(cookie);
%>

<h2 style="color:green;">Cookie Added Successfully!</h2>

<p><b>Name:</b> <%= cname %></p>
<p><b>Value:</b> <%= cvalue %></p>
<p><b>Expiry:</b> <%= cage %> seconds</p>

<br>
<a href="showcookies.jsp">View Cookies</a>

</body>
</html>