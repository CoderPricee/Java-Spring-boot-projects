<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>SpringBoot| User Login</title>

<style>
		body{
			background-color: #f2f2f2;
			font-family: Arial, sans-serif;
		}
		div {
			margin: 20px auto;
			padding: 10px;
			background-color: #ffffff;
			border-radius: 5px;
			box-shadow: 0 2px 5px rgba(0,0,0,0.3);
			max-width: 400px;
		}
		div.center {
			text-align: center;
		}
		form {
			display: flex;
			flex-direction: column;
		}
		input[type="text"], input[type="password"], input[type="submit"] {
			padding: 8px;
			margin: 5px 0;
			border-radius: 5px;
			border: none;
			box-shadow: 0 1px 2px rgba(0,0,0,0.2);
			font-size: 16px;
			background-color: #f9f9f9;
		}
		input[type="submit"] {
			background-color: #4CAF50;
			color: #ffffff;
			cursor: pointer;
		}
		input[type="submit"]:hover {
			background-color: #3e8e41;
		}
	</style>

</head>
<body>
	<!-- to prevent access before login and to prevent going back after logout-->
	<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");
	%>
	
	<div class="center">User Login</div>
	<div>
		<form action="Login" method="POST">
			<label for="uname">Username:</label> 
			<input type="text" name="uname" id="uname">
			<label for="pass">Password:</label>
			<input type="password" name="pass" id="pass"> 
			<input type="submit" value="Login">
		</form>
	</div>


</body>
</html>