package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String address = request.getParameter("address");
		Cookie c = new Cookie("address" , address);
		response.addCookie(c);
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form method=\"get\" action=\"Servlet2\">");
		out.println("<pre>");
		out.println("User  <input type = \"text\" name = \"t1\" />");
		out.println("Pass  <input type = \"text\" name = \"t2\" />");
		//out.println("<input type = \"hidden\" name = \"t3\" value='"+address+" '/>");
		out.println("<input type=\"submit\" value=\"submit\"/>");
		out.println("</pre>");
		out.println("</from>");
		out.println("</body>");
		out.println("</html>");
		doGet(request, response);
	}

}
