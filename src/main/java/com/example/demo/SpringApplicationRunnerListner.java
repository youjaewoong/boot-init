package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringApplicationRunnerListner implements ApplicationRunner {

	@Value("${keesun.fullName}")
	private String name;

	@Value("${keesun.age}")
	private int age;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("fodS:"+ args.containsOption("fod"));
		
		System.out.println("===============");
		System.out.println(name);
		System.out.println(age);
		System.out.println("===============");
	}
	
}
