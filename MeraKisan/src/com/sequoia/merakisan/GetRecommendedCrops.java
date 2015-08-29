package com.sequoia.merakisan;

import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import  javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/getRecommendedCrops")
@Consumes({"application/xml", "application/json"})
@Produces({"application/xml", "application/json"})
public class GetRecommendedCrops {
	@GET
	@Produces("application/json")
	public Response getRecommendedCrops(
			@QueryParam("latitude") String latitude,
			@QueryParam("longitude") String longitude) {
 
		Collection<String> recommendedCropsList = new ArrayList<String>();
		recommendedCropsList.add("Test String");
		System.out.println("Inside test");
		System.out.println(latitude);
		System.out.println(longitude);
		//		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		//		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
		
		return Response.ok(recommendedCropsList, MediaType.APPLICATION_JSON).build();

	}
 
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("c") Double c) {
		Double fahrenheit;
		Double celsius = c;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
}