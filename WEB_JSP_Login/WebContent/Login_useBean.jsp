<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.servlet.dao.LoginDaoImpl"%>
<%@ page import="com.servlet.dao.Login"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%-- <jsp:useBean id="login" class="com.servlet.dao.Login" scope="session" />
	<jsp:setProperty property="username" name="login" param="txtusername" />
	<jsp:setProperty property="password" name="login" param="txtpassword" />
 --%>
	<%
Login login = new Login();
	LoginDaoImpl loginDao = new LoginDaoImpl();
login.setUsername(request.getParameter("Username"));
login.setPassword(request.getParameter("Password"));

try{
if(login.getUsername().equals(login.getPassword())){
	request.getRequestDispatcher("Success.jsp").forward(request, response);
}
else
{
	request.getRequestDispatcher("Failure.jsp").forward(request, response);
}
}catch(Exception e){
	e.getCause();
}

//LoginDaoImpl loginDao = new LoginDaoImpl();
//if(loginDao.validate(login)){
//	session.setAttribute("login", login);
/* 	request.setAttribute("login", login);
	
	request.getRequestDispatcher("Success.jsp").forward(request, response);
}
else
{
	request.setAttribute("login", login);
	request.getRequestDispatcher("Failure.jsp").forward(request, response);
}
 */
 %>



</body>
</html>