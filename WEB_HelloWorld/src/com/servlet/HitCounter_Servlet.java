package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HitCounter_Servlet
 */
@WebServlet("/HitCounter_Servlet")
public class HitCounter_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  int hitCount; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HitCounter_Servlet() {
        hitCount=0;
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	hitCount=0;
    	System.out.println("Hello_Servlet");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		/*
		 * //response.setContentType("index.html"); hitCount ++;
		 * 
		 * //PrintWriter out=response.getWriter(); String title="Total number of hits";
		 * out.print(hitCount); System.out.println(hitCount);
		 */
		
		//response.getWriter().append(hitCount);
		
		hitCount++;
		String html="<html><head><title>Hello_Servlet</title></head>";
		html +="<body><h2>Hello_Servlet..</h2><h1>Counter:"+hitCount+"</h1></body></html>";
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append(html);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
