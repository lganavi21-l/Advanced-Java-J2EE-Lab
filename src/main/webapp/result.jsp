<%@ page language="java" contentType="text/html"%>
<!DOCTYPE html>
<html>
<head><title>Result 10b</title></head>
<body>

<h2>Student Result</h2>

<p><b>Roll No:</b> <%= request.getAttribute("roll") %></p>
<p><b>Name:</b> <%= request.getAttribute("name") %></p>

<p>Subject 1: <%= request.getAttribute("s1") %></p>
<p>Subject 2: <%= request.getAttribute("s2") %></p>
<p>Subject 3: <%= request.getAttribute("s3") %></p>
<p>Subject 4: <%= request.getAttribute("s4") %></p>
<p>Subject 5: <%= request.getAttribute("s5") %></p>

<p><b>Average:</b> <%= request.getAttribute("avg") %></p>
<p><b>Result:</b> <%= request.getAttribute("result") %></p>

<br>
<a href="index.jsp">Go Back</a>

</body>
</html>