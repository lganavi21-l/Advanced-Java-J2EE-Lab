<%@ page language="java" contentType="text/html"%>
<html>
<body>

<%
String name = request.getParameter("uname");
session.setAttribute("user", name);
session.setMaxInactiveInterval(60);
%>

<h2 style="color:blue;">Welcome <%= name %></h2>
<p>Session started (60 sec)</p>

<a href="second.jsp">Go to next page</a>

</body>
</html>