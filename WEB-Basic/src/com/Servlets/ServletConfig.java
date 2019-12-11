package com.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfig
 */
@WebServlet(
		urlPatterns = { "/ServletConfig" }, 
		initParams = { 
				@WebInitParam(name = "InstituteName", value = "Sinhgad College Of Science"), 
				@WebInitParam(name = "PinCode", value = "411046")
		})
public class ServletConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
    String intituteName = null;
    String pinCode = null;
    
    public ServletConfig() {
        super();
    }

	
	public void init(ServletConfig config) throws ServletException {
		
		intituteName = config.getInitParameter("InstituteName");
		pinCode = config.getInitParameter("PinCode");
		
	}

	
	public void destroy() {
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
