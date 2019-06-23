package com.apandiyan.enquiry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.apandiyan.*")
public class EnquiryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnquiryApplication.class, args);
	}

}
