<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Payialagam</title>
<style type="text/css">
.full{
	background-color:blue;
}
.align{
	background-color:gray;
}
.center {
  margin: 0;
  position: absolute;
  left: 50%;
}
.halfcenter {
  margin: 0;
  position: absolute;
  left: 35%;
  top: 45%;
}
</style>
</head>
<address class="full">
<body style="background-image:url('/home/sureshkumar/Downloads/pexels-ivan-dražić-14384748.jpg';)">

<h1 align="center"> Available Courses </h1>

<div class="center">
<form action="courseSelected" method="POST" >
	<input type="submit" name="courseName" value="Java" /><br><br>
    <input type="submit" name="courseName" value="Python" /><br><br>
    <input type="submit" name="courseName" value="JS" /><br><br>   
</form>
</div>

<div class="halfcenter">
<form action="others" method="POST">
	<input type="submit" name="click" value="Remove Register" />

	<input type="submit" name="click" value="Update Register" />

	<input type="submit" name="click" value="Show Registers" />
</form>
</div>
</address>
</body>
</html>