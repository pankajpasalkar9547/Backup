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
		String name = request.getParameter("user");
		String pass = request.getParameter("pass");
		String email = request.getParameter("email");
		int mobile = Integer.parseInt(request.getParameter("mobi"));
		Connection con = Connection1.getConnection();
		PreparedStatement pst = con.prepareStatement("update userdata set password=?,email=?,mobile=? where username=?");
		pst.setString(1, pass);
		pst.setString(2, email);
		pst.setInt(3, mobile);
		pst.setString(4, name);
		int isUpdate = pst.executeUpdate();
		if(isUpdate==1)
		{
			out.println("Updated Successfully...");
		}
		else
		{
			out.println("Not Updated Successfully...");
		}
			
	%>

</body>
</html>