package com.Servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionClass {
	//private String dbDriver = "com.mysql.cj.jdbc.Driver";
	//private String dbUrl = "jdbc:mysql:// localhost:3306/logindatabase?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	//private String dbUser = "root";
	//private String dbPass = "";
	private static Connection con=null;
	
	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql:// localhost:3306/userdatabase?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root" , "");
			//Statement st = con.createStatement();
		}
		catch(Exception ex)
		{
			System.err.println(ex);
		}
		return con;
	}
	
}
