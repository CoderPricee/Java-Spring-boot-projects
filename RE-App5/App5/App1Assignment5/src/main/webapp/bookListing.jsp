<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.io.*"%>
<%@page import="com.entity.Book"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>WELCOME</title>

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

</head>

<body>

	<!-- to prevent access before login and to prevent going back after logout-->
	<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");

	if (session.getAttribute("username") == null)
		response.sendRedirect("login.jsp");
	%>


	<div class="container-fluid">
		<div class="fixed-header">
			<div id="title" style="text-align: right;">
				<div id="title" style="text-align: center; margin-top: 1%;">
					<h1 style="background-color: #4CAF50;">BOOKS LIST</h1>
				</div>
				<form action="Logout" method="post" style="margin-top:-50px">
					<b>Welcome ${username}</b> <input type="submit"
						class="btn btn-danger" value="Logout">
				</form>
			</div>



			<form action="Add" method="post">
				<button type="submit" class=" btn mt-4 mb-4 px-3 btn-primary"
					style="text-align: center; font-size: 25px; font-weight: 500; margin-left: 87%">AddBook</button>
			</form>

			<!-- table creation -->
			<table class="table table-bordered table-hover table-striped" style="text-align:center">
				<thead>
					<tr>
						<th scope="col">Book Code</th>
						<th scope="col">Book Name</th>
						<th scope="col">Author</th>
						<th scope="col">Data Added</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>


					<c:forEach items="${books}" var="Book">
						<tr>


							<td>${Book.getBookCode()}</td>
							<td>${Book.getBookName()}</td>
							<td>${Book.getAuthor()}</td>
							<td>${Book.getAddedOn()}</td>
							<td class="col-1 text-center">
								<form action="Edit" method="post">
									<input type="text" name="bookcode"
										value="${Book.getBookCode()}" hidden> <input
										type="text" name="bookname" value="${Book.getBookName()}"
										hidden> <input type="text" name="author"
										value="${Book.getAuthor()}" hidden> <input type="text"
										name="addedOn" value="${Book.getAddedOn()}" hidden>
									<button type="submit" id="submit-btn"
										class=" col-5 p-2 mx-5 btn btn-primary ">Edit</button>
								</form>
								<form action="Delete" method="post">
									<input type="text" name="bookCode"
										value="${Book.getBookCode()}" hidden>
									<button type="submit" id="submit-btn"
										class="col-5 p-2 mx-5 mt-2 btn btn-danger ">Delete</button>
								</form>
							</td>
						</tr>
					</c:forEach>


				</tbody>
			</table>
		</div>
	</div>

</body>

</html>