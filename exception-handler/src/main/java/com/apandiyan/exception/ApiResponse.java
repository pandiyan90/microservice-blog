package com.apandiyan.exception;

public class ApiResponse {

	private boolean success;	
	private String message;	
	private ErrorData errorData;	
	private Object payload;

	public ApiResponse(boolean success, String message) {
		this.success = success;
		this.message = message;
	}

	public ApiResponse(boolean success, String message, Object payload) {
		this.success = success;
		this.message = message;
		this.payload = payload;
	}

	public ApiResponse(boolean success, String message, ErrorData errorData) {
		this.success = success;
		this.message = message;
		this.errorData = errorData;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getMessage() {
		return message;
	}

	public ErrorData getErrorData() {
		return errorData;
	}

	public Object getPayload() {
		return payload;
	}
	
}

class ErrorData {
	private String code;
	private String description;
	
	public ErrorData(String code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
}