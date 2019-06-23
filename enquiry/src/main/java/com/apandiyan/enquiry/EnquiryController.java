package com.apandiyan.enquiry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apandiyan.exception.ApiResponse;

@RestController
@RequestMapping("/enquiry")
public class EnquiryController {

	@GetMapping
	public ApiResponse enquiries() {
		return new ApiResponse(true, "Enquiry");
	}
}
