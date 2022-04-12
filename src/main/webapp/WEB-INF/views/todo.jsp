<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Welcome</title>
	<!-- Bootstrap core CSS -->
	<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
		rel="stylesheet">
</head>
<body>

	<p> Welcome ${name } </p>
	
	<p>Your Todos are: </p>
	<ol>
		<c:forEach items="${todos}" var="todo">
			<li>${todo.name} &nbsp; &nbsp; <a href="/delete-todo.do?todo=${todo.name}">Delete</a></li>
		</c:forEach>
	</ol>
	
	<form action="/todo.do" method="post">
		<input type="text" name="todo" />
		<input type="submit" value="Add" />
	</form>

	<!-- Bootstrap Javascript -->
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>

