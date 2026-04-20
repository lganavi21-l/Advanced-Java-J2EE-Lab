<%@ page language="java" contentType="text/html"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Marks 10b</title>

<script>
function validate() {
    var r = document.getElementById("rollno").value;
    var n = document.getElementById("name").value;

    if(r=="") { alert("Enter Roll No"); return false; }
    if(n=="") { alert("Enter Name"); return false; }

    for(let i=1;i<=5;i++){
        let m = document.getElementById("s"+i).value;
        if(m=="" || isNaN(m) || m<0 || m>100){
            alert("Enter valid marks for Subject "+i);
            return false;
        }
    }
    return true;
}
</script>

</head>
<body>

<h2>Student Marks Form</h2>

<form action="ResultServlet" method="post" onsubmit="return validate()">

Roll No: <input type="text" id="rollno" name="rollno"><br><br>
Name: <input type="text" id="name" name="name"><br><br>

Subject 1: <input type="number" id="s1" name="s1"><br><br>
Subject 2: <input type="number" id="s2" name="s2"><br><br>
Subject 3: <input type="number" id="s3" name="s3"><br><br>
Subject 4: <input type="number" id="s4" name="s4"><br><br>
Subject 5: <input type="number" id="s5" name="s5"><br><br>

<input type="submit" value="Submit">

</form>

</body>
</html>