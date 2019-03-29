package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@TestPropertySource(locations="classpath:/test.properties")
@SpringBootTest(classes = SpringbootExampleInitApplicationTests.class)
public class SpringbootExampleInitApplicationTests extends TestCase{

	@Autowired
	Environment environment;
	
	@Test
	public void contextLoads() {
		assertThat(environment.getProperty("jaewoong.name"))
		.isEqualTo("jaewoong");
	}

}
