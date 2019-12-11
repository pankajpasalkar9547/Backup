package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestHeader_Servlet
 */
@WebServlet("/RequestHeader_Servlet")
public class RequestHeader_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


    public RequestHeader_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Enumeration<String> headernames=request.getHeaderNames();
		StringBuffer buffer=new StringBuffer();
	while(headernames.hasMoreElements())
	{
		String headername=headernames.nextElement();
		String headervalue=request.getHeader(headername);
		buffer.append(headername +":"+headervalue);
		buffer.append("<br/>");
	}
	
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("<!DOCTYPE html> <html><head><title></title></head><body>");
	out.println(buffer.toString());
	out.println("</body><html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
