<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Using Java Beans in JSP.</h1>
		<jsp:useBean id="test" class="com.Servlets.TestBean"/>
		<jsp:setProperty name="test" property="message" value="Hello Jsp..."/>
		<p>Got Message....</p>
		<jsp:getProperty name="test" property="message"/>
	
</body>
</html>