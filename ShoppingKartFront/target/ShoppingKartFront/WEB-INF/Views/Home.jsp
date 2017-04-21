<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link rel="stylesheet" type="text/css" href="css/Home.css"> 
 <style type="text/css">
 
 body{
 background-color:orange;
 font-family:sans-serif;
 }
 li{
 display:inline;
	padding-right:10px;
 }
 ul a:hover{
 text-decoration:inherit;
 font-size:20px;
 }
 
 </style>
</head>
<body>

	<center>
		<h2>Welcome to Shopping Cart</h2>
	</center>
	${message}
	<hr color="#2955">


	<a href="LoginPage"> Login</a>

	<a href="RegistrationPage"> Register</a>


<br>
		<c:if test="${isUserClickedLogin=='true' }">
		<jsp:include page="Login.jsp"></jsp:include>
	</c:if>


	<c:if test="${isUserClickedRegister=='true' }">
		<jsp:include page="Registration.jsp"></jsp:include>
	</c:if>
	<div>
<ul>
            <li><a href="#">Home</a></li>
            <li><a href="#">About</a></li>
            <li><a href="#">Services</a></li>
            <li><a href="#">Works</a></li>
            <li><a href="#">News</a></li>
            <li><a href="#">Contact</a></li>
            
</ul>
</div>
  
</body>
</html>