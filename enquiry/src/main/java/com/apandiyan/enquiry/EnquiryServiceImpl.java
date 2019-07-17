package com.apandiyan.enquiry;

import java.util.List;

import org.springframework.stereotype.Service;

import com.apandiyan.exception.ApiResponse;
import com.apandiyan.util.PatientEnquiryDTO;

@Service
public class EnquiryServiceImpl implements EnquiryService {

	private EnquiryRepository enquiryRepository;
	
	public EnquiryServiceImpl(EnquiryRepository enquiryRepository) {
		this.enquiryRepository = enquiryRepository;
	}
	
	@Override
	public ApiResponse enquires() {
		List<Enquiry> enquiries = enquiryRepository.findAll();
		return new ApiResponse(true, "SUCCESS", enquiries);
	}

	@Override
	public ApiResponse newEnquiry(PatientEnquiryDTO patientEnquiry) {
		Enquiry enquiry = new Enquiry();
		enquiry.setFirstName(patientEnquiry.getFirstName());
		enquiry.setLastName(patientEnquiry.getLastName());
		enquiry.setMobile(patientEnquiry.getMobile());
		enquiry.setEmail(patientEnquiry.getEmail());
		enquiry.setAdditionalPhone(patientEnquiry.getAdditionalPhone());
		enquiryRepository.save(enquiry);
		return new ApiResponse(true, "SUCCESS");
	}

}
