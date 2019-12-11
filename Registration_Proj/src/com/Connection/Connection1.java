package com.Connection;


import java.sql.Connection;
import java.sql.DriverManager;

public class Connection1 {
	public static Connection getConnection()
	{
		Connection con=null;
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
