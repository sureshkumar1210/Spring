<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register your Course</title>
<style type="text/css">
.center {
  margin: 0;
  position: absolute;
  left: 45%;
}
</style>
</head>
<body>
<h1 align="center"> Enter your details </h1>
<div class="center">

	<form action="save" method="POST">
	
		<label for="Name">Name</label>
		<input type="text" name="name" /> <br><br>
		<label for="Email">Email</label>
	    <input type="text" name="email"  /> <br><br>
	    <label for="phoneNo">Phone No</label>
	    <input type="text" name="phoneNo"  /> <br><br>
	    <label for="courseName">Course Name</label>
	    <input name="courseName" value="${courseName}" readonly="readonly"/> <br><br>
		<input type="submit" value="Submit">
		
	</form>

</div>


</body>
</html>