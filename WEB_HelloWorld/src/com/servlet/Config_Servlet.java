package com.servlet;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.sun.xml.internal.fastinfoset.sax.Properties;

/**
 * Servlet implementation class Config_Servlet
 */
@WebServlet(
		urlPatterns = { "/Config_Servlet" }, 
		initParams = { 
				@WebInitParam(name = "db.driver", value = "com.mysql.cj.jdbc.Driver"), 
				@WebInitParam(name = "db.url", value = "jdbc:mysql://localhost:3306/servlet"), 
				@WebInitParam(name = "db.username", value = "root"), 
				@WebInitParam(name = "db.password", value = "")
		})
public class Config_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String driver;
	String url;
	String username;
	String password;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Config_Servlet() {
        super();
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	driver = config.getInitParameter("db.driver");
    	//getServletContext().setAttribute("driver", driver);
    	
    	url = config.getInitParameter("db.url");
    	//getServletContext().setAttribute("url", url);
    	
    	username = config.getInitParameter("db.username");
    	//getServletContext().setAttribute("username", username);
    	
    	password = config.getInitParameter("db.password");
    	//getServletContext().setAttribute("password", password);
    	
    	Properties props = new Properties();
    	props.put("dbdriver" , driver);
    	props.put("db.url", url);
    	props.put("db.username", username);
    	props.put("db.password", password);
    	
    	ServletContext servletcontext = getServletContext();
    	servletcontext.setAttribute("dbproperties", props);
    	
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/Context_Servlet").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
