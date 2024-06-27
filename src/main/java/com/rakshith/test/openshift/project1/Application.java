package com.rakshith.test.openshift.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/helloworld")
	public String helloworld() {
		return "App is up and open for business";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
