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
	
		String name = request.getParameter("searchtxt");
		//request.setAttribute(name, "setval");
		Connection con = Connection1.getConnection();
		PreparedStatement pst = con.prepareStatement("SELECT * FROM userdata where Username=?");
		pst.setString(1, name);
		ResultSet rs = pst.executeQuery();
		while(rs.next())
		{
			out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			break;
		}
		//out.println(name);
	%>
</body>
</html>