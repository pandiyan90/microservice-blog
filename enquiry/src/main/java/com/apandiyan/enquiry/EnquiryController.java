package com.apandiyan.enquiry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apandiyan.exception.ApiResponse;
import com.apandiyan.util.PatientEnquiryDTO;

@RestController
@RequestMapping("/enquiry")
public class EnquiryController {

	private EnquiryService enquiryService;
	
	public EnquiryController(EnquiryService enquiryService) {
		this.enquiryService = enquiryService;
	}
	
	@GetMapping
	public ApiResponse enquiries() {
		return enquiryService.enquires();
	}
	
	@PostMapping("/new")
	public ApiResponse newEnquiry(@RequestBody PatientEnquiryDTO patientEnquiry) {
		return enquiryService.newEnquiry(patientEnquiry);
	}
	
}
