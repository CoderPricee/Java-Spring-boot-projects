<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.entity.Author"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");

	if (session.getAttribute("username") == null)
		response.sendRedirect("login.jsp");
	%>
	<div class="fixed-header">
		<div id="title" style="text-align: right;">
			<div id="title" style="text-align: center; margin-top: 1%;">
				<h1 style="background-color: #4CAF50;">ADD BOOKS DETAILS</h1>
			</div>
			<form action="Logout" method="post" style="margin-top: -50px">
				<b>Welcome ${username}</b> <input type="submit"
					class="btn btn-danger" value="Logout">
			</form>
		</div>

		<br>
		<br>

		<div class="main-content col-6">
			<form action="Addbook" method="post">
				<div class="mb-3 row">
					<label for="BookCode" class="col-2 mx-4">Book Code</label> <input
						type="text" class="col-4" id="bookCode" name="bookCode"
						onkeypress="return /[0-9]/i.test(event.key)" required>

				</div>
				<div class="mb-3 row">
					<label for="BookName" class="col-2 mx-4">Book Name</label> <input
						type="text" class="col-4" id="bookName" name="bookName" required>

				</div>
				<div class="mb-3 row">
					<label for="Author" class="col-2 mx-4">Author</label> <select
						class="col-4" name="author" id="author" required>
						<c:forEach items="${Author}" var="Author">
							<option value="${Author.getName()}">${Author.getName()}</option>
						</c:forEach>
					</select>

				</div>
				<div class="mb-3 row">
					<label for="AddedOn" class="col-2 mx-4">Added On</label> <input
						type="text" id="addedOn" class="col-4" value="${date}"
						name="addedOn" readonly>


				</div>


				<div class="col-12 mx-4">
					<button type="submit" class="btn btn-outline-success">SAVE</button>
				</div>
			</form>

			<div class="col-5 mx-4 pt-2">
				<a href="bookListing.jsp"><button class="btn btn-outline-danger">CANCEL</button></a>

			</div>

		</div>

	</div>



</body>

</html>