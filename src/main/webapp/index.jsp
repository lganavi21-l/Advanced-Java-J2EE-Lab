<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><title>7b Cookie Demo</title></head>
<body>

<h2>Create Cookie</h2>

<form action="addcookie.jsp" method="post">
Cookie Name: <input type="text" name="cname" required><br><br>
Value: <input type="text" name="cvalue" required><br><br>
Expiry (seconds): <input type="number" name="cage" required><br><br>

<input type="submit" value="Add Cookie">
</form>

</body>
</html>