package com.example.demo;

import java.time.Duration;

import javax.validation.constraints.NotEmpty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties("jaewoong")
@Validated
public class JaewoongProperties {
	
	@NotEmpty
	private String name;
	
	private String fullName;
	private int age;
	private Duration sessionTimeout = Duration.ofSeconds(30);
	
	public Duration getSessionTimeout() {
		return sessionTimeout;
	}
	public void setSessionTimeout(Duration sessionTimeout) {
		this.sessionTimeout = sessionTimeout;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}