package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig {

	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name = {"student", "s1", "st"})
	public Student getStudent() {
		//creating student object
		Student student = new Student(getSamosa());
		return student;
	}
}
