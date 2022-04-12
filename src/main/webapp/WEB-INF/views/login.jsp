<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Helloooooooo from JSP</title>
</head>
<body>
<div><font color="red">${invalid}</font></div>

<form action="/login.do" method="post">
Name: <input type="text" name="name" />
Password: <input type="password" name="password" />
<input type="submit" value="login"/>
</form>

</body>
</html>