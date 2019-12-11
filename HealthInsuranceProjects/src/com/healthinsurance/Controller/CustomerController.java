package com.healthinsurance.Controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.healthinsurance.DAO.UserDAO;
import com.healthinsurance.DAO.UserDAOImpl;
import com.healthinsurance.model.User;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    static User user = new User();
    UserDAO userdao = new UserDAOImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int age = (Integer.parseInt(request.getParameter("age")));
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String birthdate = request.getParameter("birthdate");
		
		user.setName(name);
		user.setAddress(address);
		user.setUsername(username);
		user.setPassword(password);
		user.setAge(age);
		user.setEmail(email);
		user.setGender(gender);
		user.setBirthDate(birthdate);
		
		boolean isAdded = userdao.addUser(user);
		if(isAdded)
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login.html");
			dispatcher.forward(request, response);
			System.out.println("addedd");
		}
		else
			System.out.println("Not Added");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean isLoginSuccess = userdao.login(username, password);
		if(isLoginSuccess)
		{
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("username", user.getUsername());
			//RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			//dispatcher.forward(request, response);
			//System.out.println("Login Success");
			response.sendRedirect("index.jsp");
		}
		else
		{
			System.out.println("Not Success");
		}
		//doGet(request, response);
	}

}
