<%@ page language="java" contentType="text/html"%>
<html>
<body>

<%
String name = request.getParameter("uname");
int expiry = Integer.parseInt(request.getParameter("expiry"));

session.setAttribute("user", name);
session.setMaxInactiveInterval(expiry);
%>

<h2 style="color:blue;">Welcome <%= name %></h2>
<p>Session expiry set to <%= expiry %> seconds</p>

<a href="second.jsp">Check Session</a>

</body>
</html>