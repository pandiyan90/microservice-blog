package com.apandiyan.registration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apandiyan.exception.ApiResponse;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

	@GetMapping
	public ApiResponse register() {
		return new ApiResponse(true, "Registered");
	}
}
