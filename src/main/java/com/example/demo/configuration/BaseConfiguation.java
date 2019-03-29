package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class BaseConfiguation {

	@Bean
	public String hello() {
		return "hello prod";
	}
}
