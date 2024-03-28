package com.springcore.javaConfigDemo;

import org.springframework.context.annotation.Bean;

//work asa xml bean file
public class JavaConfig {

	@Bean
	public Address getAddress() {
		return new Address();
	}

	@Bean(name = { "info1" })
	public Student getStudent() {
		Student student = new Student(getAddress());
		return student;
	}

}
