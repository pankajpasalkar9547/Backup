package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		String dbDriver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql:// localhost:3306/logindatabase?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		// String dbUrl ="jdbc:mysql://localhost:3306/logindatabase";
		String user = "root";
		String pass = "";
		// String query="SELECT * FROM login";
		try {
			Class.forName(dbDriver);
			Connection con = DriverManager.getConnection(dbUrl, user, pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM login");

			while (rs.next()) {
				// out.println(rs.getString(1) + " " + rs.getString(2));
				// System.out.println(rs.getString(1)+" "+rs.getString(2));
				String name = rs.getString(1);
				String pass1 = rs.getString(2);
				out.println(name + " " + pass1);
				if ((username.equalsIgnoreCase(name)) && (password.equalsIgnoreCase(pass1))) {
					RequestDispatcher rd = request.getRequestDispatcher("Succsess.jsp");
					rd.include(request, response);
				} else {
					RequestDispatcher rd = request.getRequestDispatcher("Failure.jsp");
					rd.include(request, response);
				}
			}
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}

		// out.println(username);
		// out.println(password);
		doGet(request, response);
	}
}
