package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringApplicationRunnerListner implements ApplicationRunner {

	@Value("${jaewoong.fullName}")
	private String name;

	@Value("${jaewoong.age}")
	private int age;
	
	@Autowired
	JaewoongProperties jaewoongProperties;
	
	@Autowired
	private String hello;
	 
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("fodS:"+ args.containsOption("fod"));
		
		System.out.println("===============");
		System.out.println(name);
		System.out.println(age);
		
		System.out.println("=====jaewoongProperties======");
		System.out.println(jaewoongProperties.getName());
		System.out.println(jaewoongProperties.getAge());
		System.out.println(jaewoongProperties.getFullName());
		System.out.println(jaewoongProperties.getSessionTimeout());
		
		System.out.println("=====profile======");
		System.out.println(hello);
	}
	
}
