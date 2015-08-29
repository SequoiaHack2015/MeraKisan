package com.sequoia.merakisan;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.sequoia.merakisan.recommended.items.CropIf;
import com.sequoia.merakisan.recommended.items.CropRecommendationProcessor;
import com.sequoia.merakisan.requests.RecommendedCropRequest;

@Path("/getrecommendedcrops")
public class GetFarmerRecommendedCrops {
	@GET
	@Produces("application/json")
	public Response getRecommendedCrops(
			@QueryParam("latitude") String latitude,
			@QueryParam("longitude") String longitude) {

		try {
			System.out.println("latitude --" + latitude);
			System.out.println("longitude --" + longitude);

			CropRecommendationProcessor processor = new CropRecommendationProcessor();
			
			Collection<CropIf> recommendedCrops =  processor.executeProcessor(createGetRecommendedProcessorRequest(latitude, longitude));
			
			return Response.ok(recommendedCrops, MediaType.APPLICATION_JSON)
					.build();

		} catch (Exception e) {
			ErrorResponse errorResponse = new ErrorResponse(e.getMessage(),
					"Please try after sometime!!");
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(errorResponse).build();
		}
	}
	
	private RecommendedCropRequest createGetRecommendedProcessorRequest(String latitude, String longitude){
		
	return new RecommendedCropRequest(latitude, longitude);
	
	}

}