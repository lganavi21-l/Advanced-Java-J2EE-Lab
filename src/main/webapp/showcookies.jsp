<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><title>Show Cookies</title></head>
<body>

<h2>Available Cookies</h2>

<%
Cookie[] cookies = request.getCookies();

if (cookies != null) {
%>

<table border="1">
<tr>
<th>Name</th>
<th>Value</th>
<th>Max Age</th>
</tr>

<%
for (Cookie c : cookies) {
%>
<tr>
<td><%= c.getName() %></td>
<td><%= c.getValue() %></td>
<td><%= c.getMaxAge() %></td>
</tr>
<%
}
%>

</table>

<%
} else {
%>
<p>No cookies found</p>
<%
}
%>

<br>
<a href="index.jsp">Go Back</a>

</body>
</html>