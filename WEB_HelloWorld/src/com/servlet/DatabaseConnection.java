package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	public static Connection getConnection()
	{
	String dbDriver = "com.mysql.cj.jdbc.Driver"; 
    String dbURL = "jdbc:mysql:// localhost:3306/servlet?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
    //String dbName = "servletjdbc1"; 
    String dbUsername = "root"; 
    String dbPassword = ""; 

    try {
		Class.forName(dbDriver);
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} 
    Connection con = null;
	try {
		con = DriverManager.getConnection(dbURL,dbUsername,dbPassword);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
    return con; 
	}

}
