package com.apandiyan.enquiry;

import com.apandiyan.exception.ApiResponse;
import com.apandiyan.util.PatientEnquiryDTO;

public interface EnquiryService {

	public ApiResponse enquires();
	
	public ApiResponse newEnquiry(PatientEnquiryDTO patientEnquiry);
	
}
