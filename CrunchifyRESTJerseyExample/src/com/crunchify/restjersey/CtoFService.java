package com.crunchify.restjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/ctofservice")
public class CtoFService {
	@GET
	@Produces("appliacation/xml")
	public String convertCtoF()
	{
		Double far;
		Double cel = 36.8;
		far = ((cel * 9)/5)+32;
		
		String result = "@Produces(\"appliaction/xml\") Output : \n\nC to F Converter Output : \n\n"+far;
		return "<ctofservice>"+"<celsius>"+ cel + "</celsius>"+"<ctofoutput>"+result+"</ctofoutput"+"</ctofservice>"; 
	}
	
	@Path("{c}")
	@GET
	@Produces("appliacation/xml")
	public String convertCtoFfromInput(@PathParam("c") Double c)
	{
		Double far;
		Double cel = c;
		far = ((cel * 9)/5)+32;
		
		String result = "@Produces(\"appliaction/xml\") Output : \n\nC to F Converter Output : \n\n"+far;
		return "<ctofservice>"+"<celsius>"+ cel + "</celsius>"+"<ctofoutput>"+result+"</ctofoutput"+"</ctofservice>";
	}

}
