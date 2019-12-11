<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome to JSP world..<br>
the Date on server is<%= new java.util.Date() %>

<%! int count=10; 
public void increment()
{
 count++;
}
%>
The Count is<%= count  %><br>
<% increment(); %>

</body>
</html>