<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to COURSE</title>
<style type="text/css">
	.container {
		color: #e5e5e5;
		font-size: 2.26rem;
		text-transform: uppercase;
		display: flex;
		align-items: center;
		justify-content: left;
	}

	.animation {
		height:50px;
		overflow:hidden;
		margin-left: 1rem;
	}

	.animation > div > div {
		padding: 0.25rem 0.75rem;
		height:2.81rem;
		margin-bottom: 2.81rem;
		display:inline-block;
	}

	.animation div:first-child {
		animation: text-animation 8s infinite;
	}

	.first div {
		background-color:deeppink;
	}
	.second div {
		background-color: greenyellow;
	}
	.third div {
		background-color:Purple;
	}

	@keyframes text-animation {
		0% {margin-top: 0;}
		10% {margin-top: 0;}
		20% {margin-top: -5.62rem;}
		30% {margin-top: -5.62rem;}
		40% {margin-top: -11.24rem;}
		60% {margin-top: -11.24rem;}
		70% {margin-top: -5.62rem;}
		80% {margin-top: -5.62rem;}
		90% {margin-top: 0;}
		100% {margin-top: 0;}
	}


	.course {
		padding: 8px 20px;
		width:200px;
		height:50px;
		color:darkred;
		font-weight:700;
		border-radius: 0;
		text-transform: uppercase;
		margin:25px;
		overflow: hidden;
		position:relative;
		top:20%;
		left:50%;
	}
	.course::before{
		content: "";
		top:0;
		left:0;
		width:50%;
		height:50%;
		background: linear-gradient(120deg,transparent,#00fffc,transparent);
		transform: translateX(-100%);
		transition:0.6s;
		position:absolute;
	}
	.course:hover{
		background: transparent;
		box-shadow:0 0 20px 5px #00fffc;
	}
	.halfcenter {
		margin: 0;
		position: absolute;
		left: 35%;
		top: 80%;
	}

	body{
		background-color:#000;
		display: flex;
		justify-content: center;
		align-items: center;
		height:100%;
		margin:0;
		font-family: 'Raleway',sans-serif;
	}
	button::after,button::before{
		content:'';
		width:0%;
		height:2px;
		background:green;
		display:block;
		transition: 0.5s;
	}
	button:hover::after,button:hover::before{
		width:100%;
	}



</style>
</head>
<address class="full">
<body >

<main class="container">
	<p><b>Register My Course</b> 👋</p>
	<section class="animation">
		<div class="first"><div>HTML</div></div>
		<div class="second"><div>CSS</div></div>
		<div class="third"><div>JAVA SCRIPT</div></div>
	</section>
</main>

<div class="center">
<form action="courseSelected" method="POST" >
	<input type="submit" name="courseName" value="HTML" class="course"/><br><br>
    <input type="submit" name="courseName" value="CSS" class="course" /><br><br>
    <input type="submit" name="courseName" value="JAVA SCRIPT"  class="course"/><br><br>
</form>
</div>

<div class="halfcenter">
<form action="others" method="POST">
	<button type="submit" name="click" value="Remove Register" > <b>Remove Register</b></button>

	<button type="submit" name="click" value="Update Register" > <b>Update Register</b></button>

	<button type="submit" name="click" value="Show Registers" ><b>Show Registers</b></button>
</form>
</div>
</address>
</body>
</html>