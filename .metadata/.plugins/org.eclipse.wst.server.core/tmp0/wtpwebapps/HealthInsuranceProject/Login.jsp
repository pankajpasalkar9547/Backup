<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action ="CustomerController" method="post">
	<pre>
		UserName : <input type="text" placeholder="Enter The Username" name="username"/><br><br>
		Password : <input type="password" placeholder="Enter The Password" name="password"/><br><br>
		<input type="submit" value="submit"><br><br>
		<input type="reset" value="Clear">
		<a href="userRegister.jsp">Sign Up</a>
	</pre>
	</form>
</body>
</html>