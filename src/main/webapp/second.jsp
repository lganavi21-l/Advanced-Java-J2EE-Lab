<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><title>Second Page</title></head>
<body>

<h2>Session Value</h2>

<%
String name = (String) session.getAttribute("user");

if (name == null) {
%>
<h3 style="color:red;">Session Expired!</h3>
<%
} else {
%>
<h3 style="color:green;">Hello <%= name %></h3>
<%
}
%>

<br>
<a href="index.html">Go Back</a>

</body>
</html>