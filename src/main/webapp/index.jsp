<%@ page language="java" contentType="text/html"%>
<!DOCTYPE html>
<html>
<head>
<title>User Data 10a</title>

<script>
function validate() {
    var u = document.getElementById("username").value;
    var e = document.getElementById("email").value;
    var d = document.getElementById("designation").value;

    if(u=="") { alert("Enter Username"); return false; }
    if(e=="" || !e.includes("@")) { alert("Enter valid Email"); return false; }
    if(d=="") { alert("Enter Designation"); return false; }

    return true;
}
</script>

</head>
<body>

<h2>User Data Form</h2>

<form action="UserDataServlet" method="post" onsubmit="return validate()">

Username: <input type="text" id="username" name="username"><br><br>
Email: <input type="text" id="email" name="email"><br><br>
Designation: <input type="text" id="designation" name="designation"><br><br>

<input type="submit" value="Submit">

</form>

</body>
</html>