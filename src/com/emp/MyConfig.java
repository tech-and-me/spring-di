package com.emp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration	//Replacement of entire XML
@ComponentScan(basePackages = "com.emp")
public class MyConfig {
	
	@Bean(value = "a5")
	public Address getBean1() {
		Address a = new Address("New Zealand", "Hamilton", 3210);
		return a;
	}
	
	@Bean(value = "a6")
	@Primary
	public Address getBean2() {
		Address a = new Address("Australia", "Sydney", 2000);
		return a;
	}
}
