package com.example.Spring_cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCicdApplication {

	@GetMapping("/welcome")
	public String message() {
		System.out.println("Spring ci-cd using github actions..!");
		return "Spring ci-cd using github actions..!.";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCicdApplication.class, args);
	}

}
