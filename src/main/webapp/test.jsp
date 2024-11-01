<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Account</h1>
	<form action="control-servlet" method="post">
		Username: <input type="text" name="accountID" placeholder="username">
		Password: <input type="password" name="password" placeholder="password">
		<input type="submit" name="action" value="Login">
	</form>

	<%
	request.setAttribute("action", "Login"); 
	%>
</body>
</html>
