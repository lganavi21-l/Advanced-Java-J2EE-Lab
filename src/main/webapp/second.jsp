<%@ page language="java" contentType="text/html"%>
<html>
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
<h3>Hello <%= name %></h3>
<%
}
%>

<a href="index.html">Go Back</a>

</body>
</html>