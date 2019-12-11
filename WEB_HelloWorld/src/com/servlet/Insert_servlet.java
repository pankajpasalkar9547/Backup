package com.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

/**
 * Servlet implementation class Insert_servlet
 */
@WebServlet("/Insert_servlet")
public class Insert_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String uname=request.getParameter("uname");
		String password=request.getParameter("psw");
		
		Connection con=DatabaseConnection.getConnection();
		try {
			PreparedStatement pst=con.prepareStatement("insert into loginfo values (?, ?)");
			pst.setString(1, uname);
			pst.setString(2, password);
			pst.executeUpdate();
			ResultSet rs = pst.executeQuery("select * from loginfo");
			ResultSetMetaData metadata = (ResultSetMetaData) rs.getMetaData();
			
			PrintWriter out = response.getWriter(); 
            out.println("<html><body><b>Successfully Inserted"
                        + "</b></body></html>"); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
