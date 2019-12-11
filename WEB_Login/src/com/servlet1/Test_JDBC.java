package com.servlet1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.servlet.bean.Login;

public class Test_JDBC {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/servletjdbc1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "");
			Statement stmt = con.createStatement();
			String sql = "Select * from logininfo1";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2));
			}
		} catch (ClassNotFoundException e)

		{
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}
}
