package com.sequoia.merakisan.requests;

public class RecommendedCropRequest implements ProcessorRequestIf{

	String latitude;
	
	String longitude;

	
	public RecommendedCropRequest(String latitude, String longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	
}
