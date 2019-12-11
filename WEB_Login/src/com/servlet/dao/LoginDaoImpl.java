package com.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.servlet.bean.Login;

public class LoginDaoImpl implements LoginDao {

	public LoginDaoImpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false", "root", "root");
	}

	@Override
	public boolean validate(Login login) {
		boolean status = false;
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection
						.prepareStatement("select * from login where username = ? and password = ? ")) {
			preparedStatement.setString(1, login.getUsername());
			preparedStatement.setString(2, login.getPassword());
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			
			//while(rs.next()) {
				if(login.getUsername().equals(rs.getString(1)) && login.getPassword().equals(rs.getString(2))) {
					
						status=true;
						//return status;
					
				}
				else {
					status=false;
				}
			// }
			
			
			
			//status = rs.next();

		} catch (SQLException e) {
			// process sql exception
			printSQLException(e);
		}
		
		return status;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}

}
