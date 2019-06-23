package com.apandiyan.exception;

public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 996146720705933976L;

	public CustomException() {
		super();
	}

	public CustomException(String message) {
		super(message);
	}

}
