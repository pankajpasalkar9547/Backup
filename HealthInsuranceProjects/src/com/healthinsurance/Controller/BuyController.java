package com.healthinsurance.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.healthinsurance.DAO.CheckDAO;
import com.healthinsurance.DAO.CheckDAOImpl;
import com.healthinsurance.model.PolicyData;


@WebServlet("/BuyController")
public class BuyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static CheckDAO checkDAO = new CheckDAOImpl();
			
       
    
    public BuyController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String action = request.getParameter("action");
		if(action != null && action.equals("buypolicy"))
		{
			int companyId = Integer.parseInt(request.getParameter("companyid"));
			PolicyData policyData = checkDAO.getPolicyDetailsByCompanyId(companyId);
			if (policyData != null)
			{
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("finalform2.jsp");
				request.setAttribute("policyData",policyData);
				requestDispatcher.forward(request, response);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
