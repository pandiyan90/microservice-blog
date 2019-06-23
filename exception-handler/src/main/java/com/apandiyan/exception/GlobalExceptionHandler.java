package com.apandiyan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ApiResponse> handleException(Exception exception) {
		ApiResponse apiResponse = new ApiResponse(false, exception.getMessage());
		return new ResponseEntity<>(apiResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = CustomException.class)
	public ResponseEntity<ApiResponse> handleCustomException(CustomException exception) {
		ApiResponse apiResponse = new ApiResponse(false, exception.getMessage());
		return new ResponseEntity<>(apiResponse, HttpStatus.BAD_REQUEST);
	}
}
