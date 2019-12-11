package com.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.DAOImpl;
import com.Pojo.UserPOJO;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			DAOImpl dao=new DAOImpl();
			UserPOJO user=new UserPOJO();
			user.setUserName(request.getParameter("username"));
			user.setPassword(request.getParameter("password"));
			user.setEmail(request.getParameter("email"));
			user.setMobileNO((int)Integer.parseInt(request.getParameter("mobile")));
		System.out.println("Servlet....");
		boolean isTrue =dao.insert(user); 
		if(isTrue==true)
		{
			RequestDispatcher rd=request.getRequestDispatcher("Login_HTML.html");
			rd.forward(request, response);
			System.out.println("true....");
		}
		else {
		RequestDispatcher rd=request.getRequestDispatcher("Failure.jsp");
		rd.forward(request, response);
			System.out.println("Faluse....");
			
		}
		}
		catch(Exception e) {e.printStackTrace();}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
