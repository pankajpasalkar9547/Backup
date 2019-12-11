package com.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImpl implements LoginDao {

	public LoginDaoImpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql:// localhost:3306/servletjdbc1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
	}

	@Override
	public boolean validate(Login login) {
		//boolean status = false;
		int counter=0;
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection
						.prepareStatement("select * from logininfo1 where uname = ? and password = ? ")) {
			preparedStatement.setString(1, login.getUsername());
			preparedStatement.setString(2, login.getPassword());
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
			if ((login.getUsername().equals(rs.getString(1))) && (login.getPassword().equals(rs.getString(2)))) {
				//status = true;
				// return status;
				counter++;
				break;
			} else {
				System.out.println("Record not found");
				//status = false;
				//return status;
			}
			//return status;
			}
			// status = rs.next();

		} catch (SQLException e) {
			// process sql exception
			printSQLException(e);
		}
		
		if(counter>0) {
			return true;
		}
		else {
			return false;
		}

		//return status;
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
