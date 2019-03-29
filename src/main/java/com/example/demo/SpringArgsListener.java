package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class SpringArgsListener {
	
	public SpringArgsListener(ApplicationArguments args) {
		
		System.out.println("fod:" + args.containsOption("fod"));
		System.out.println("bar:" + args.containsOption("bar"));
	}

}
