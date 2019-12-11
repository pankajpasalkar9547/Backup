<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
hello...
<%
out.println(request.getParameter("num1"));
out.println(request.getParameter("num2"));
out.println(request.getParameter("opr"));
int num1 =Integer.parseInt(request.getParameter("num1"));
int num2 =Integer.parseInt(request.getParameter("num2"));
int result=num1+num2;

%>
The result is<%= result  %>
</body>
</html>