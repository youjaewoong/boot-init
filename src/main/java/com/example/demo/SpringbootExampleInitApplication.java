package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootExampleInitApplication {

	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(SpringbootExampleInitApplication.class);
		app.addListeners(new SpringListener());
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
		
		//SpringApplication.run(SpringbootExampleInitApplication.class, args);
	}

}
