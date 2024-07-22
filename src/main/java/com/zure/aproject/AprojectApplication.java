package com.zure.aproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AprojectApplication {

	@GetMapping("/message")
	public String getMessage() {
		
		return "First Spring boot project in Azure cloud.";
	}
	public static void main(String[] args) {
		SpringApplication.run(AprojectApplication.class, args);
	}

}
