<%@page import="iuh.se.models.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thong tin ca nhan</title>
</head>

<%
Account account = (Account) request.getServletContext().getAttribute("AccountData");
%>
<body>
	<h1>Thong tin ca nhan</h1>
	<p>
		Account ID :
		<%=account.getAccountID()%>
		<br>
	<p>
		Full name:
		<%=account.getFullName()%>
		<br>
	<p>
		Password :
		<%=account.getPassword()%>
		<br>
	<p>
		Email:
		<%=account.getEmail()%>
		<br>
	<p>
		Phone:
		<%=account.getPhone()%>
		<br>
	<p>
		Status :
		<%=account.getStatus()%>
		<br>
		
		
</body>
</html>