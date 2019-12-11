package com.webserviseclasses;

public class EMICalculator {
	
	public String getEMI(float principle, float noOfMonths)
	{
		double answer=0.0;
		double emi=0.0;
		double simpleInterest=0.0;
		
		if(noOfMonths>=1 && noOfMonths<=3)
		{
			simpleInterest=principle*noOfMonths*2.0f;
			answer=principle+(simpleInterest/100);
			emi=answer/noOfMonths;
		}
		else if (noOfMonths>=3 && noOfMonths<=6)
		{
			simpleInterest=principle*noOfMonths*5.0f;
			answer=principle+(simpleInterest/100);
			emi=answer/noOfMonths;
		}
		else if(noOfMonths>=6 && noOfMonths<=18)
		{
			simpleInterest=principle*noOfMonths*8.0f;
			answer=principle+(simpleInterest/100);
			emi=answer/noOfMonths;
		}
		else
		{
			return "Enter The Valid Month from 1 to 18.";
		}
		
		
		return "Your EMI for "+noOfMonths+" Months is Rs."+emi+" p/month";	
	}
}
