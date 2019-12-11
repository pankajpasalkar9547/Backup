package com.Controller;
import com.Connection.Connection1;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.Registration.Connection1;

/**
 * Servlet implementation class Login_Servlet
 */
@WebServlet("/Login_Servlet")
public class Login_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn= Connection1.getConnection();
		String user=request.getParameter("Username");
		String pass=request.getParameter("Password");
		try {
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from userdata");
		while(rs.next())
		{
			String name=rs.getString(1);
			String pass1=rs.getString(2);
			//System.out.println(name);
			//System.out.println(pass1);
			if((name.equalsIgnoreCase(user))&&(pass1.equalsIgnoreCase(pass)))
			{
				RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
				rd.include(request, response);
				break;
			}
			/*else
			{
				RequestDispatcher rd=request.getRequestDispatcher("Failure.jsp");
				rd.include(request, response);
				break;
			}*/
		}
		rs.close();
		conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
