package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String user=request.getParameter("uname");
		String pass=request.getParameter("psw");
		PrintWriter out=response.getWriter();
		if(user.equals(pass))
		{
			//System.out.println("login succesfully");
			//out.println("login succesfully");
			request.getRequestDispatcher("Success.html").forward(request, response);
		}
		
		else
		{
			//System.out.println("invalid");
			//request.getRequestDispatcher("login.html").forward(request, response);
			response.setHeader("Refresh", "3;URL=" + "login.html");
			out.println("Incorrect");
			out.flush();
		}
	}

}
