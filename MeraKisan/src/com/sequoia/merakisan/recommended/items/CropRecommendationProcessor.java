package com.sequoia.merakisan.recommended.items;

import java.util.ArrayList;
import java.util.Collection;

import com.sequoia.merakisan.processor.ProcessorIf;
import com.sequoia.merakisan.requests.ProcessorRequestIf;

public class CropRecommendationProcessor implements ProcessorIf{

	@Override
	public Collection<CropIf> executeProcessor(ProcessorRequestIf request) {
		
		
		Collection<CropIf> recommendedCrops = new ArrayList<>();
		recommendedCrops.add(new RecommendedCrop("Grape", 90.0f));
		recommendedCrops.add(new RecommendedCrop("Oranges", 90.0f));
		
		return recommendedCrops;
	}

}
