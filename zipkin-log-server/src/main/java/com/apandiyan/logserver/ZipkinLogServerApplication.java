package com.apandiyan.logserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZipkinLogServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinLogServerApplication.class, args);
	}

}
