package com.sequoia.merakisan.recommended.items;

public class RecommendedCrop implements CropIf{

	String cropName;

	float yieldValue;

	int cropId;

	public int getCropId() {
		return cropId;
	}

	public void setCropId(int cropId) {
		this.cropId = cropId;
	}

	public RecommendedCrop(String cropName, float yieldValue) {
		this.cropName = cropName;
		this.yieldValue = yieldValue;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public float getYieldValue() {
		return yieldValue;
	}

	public void setYieldValue(float yieldValue) {
		this.yieldValue = yieldValue;
	}
}
