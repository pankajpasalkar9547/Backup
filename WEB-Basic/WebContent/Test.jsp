<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="java.io.PrintWriter"%>
	<%@ page language="java"%>
	<%
		PrintWriter pw = response.getWriter();
		pw.println("Soumya");
		out.println("Chitra");
		pw.println("Soumya");
		out.println("Chitra");
		pw.println("Soumya");
		out.println("Chitra");
		pw.println("Soumya");
		out.println("Chitra");
	%>
</body>
</html>