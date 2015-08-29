package com.sequoia.merakisan;

public class ErrorResponse {

	String exceptionString;
	
	String reason;

	public ErrorResponse(String exceptionString, String reason) {
		this.exceptionString = exceptionString;
		this.reason = reason;
	}
	
	public String getExceptionString() {
		return exceptionString;
	}

	public void setExceptionString(String exceptionString) {
		this.exceptionString = exceptionString;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	
}
