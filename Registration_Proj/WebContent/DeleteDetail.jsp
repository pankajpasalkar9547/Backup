<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.Connection.Connection1" %> 
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		String name = request.getParameter("deletetxt");
		Connection con = Connection1.getConnection();
		PreparedStatement pst = con.prepareStatement("DELETE FROM userdata WHERE Username =?");
		pst.setString(1, name);
		int result = pst.executeUpdate();
		if(result==1)
		{
			out.println("Data Deleted Successfully");
		}
		else
		{
			out.println("Data Not Deleted Successfully");
		}
		
	%>
</body>
</html>