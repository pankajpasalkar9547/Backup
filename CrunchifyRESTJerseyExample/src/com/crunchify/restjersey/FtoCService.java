package com.crunchify.restjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/ftocservice")
public class FtoCService {
	@GET
	@Produces("appliacation/json")
	public Response convertFtoC()throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
		Double cel;
		Double far = 98.24;
		cel = (far - 32)*5/9;
		jsonobject.put("F value", far);
		jsonobject.put("C value", cel);
		
		String result = "@Produces(\"application/json\") Output: \n\n F to C Converter Output : \n\n"+jsonobject;
		return Response.status(200).entity(result).build();
	}
	
	@Path("{f}")
	@GET
	@Produces("application/json")
	public Response convertFtoCfromInput(@PathParam("f") float f) throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
		float cel;
		cel = (f - 32)*5/9;
		jsonobject.put("F value", f);
		jsonobject.put("C value", cel);
		
		String result = "@Produces(\"application/json\") Output: \n\n F to C Converter Output : \n\n"+jsonobject;
		return Response.status(200).entity(result).build();
	}

}
