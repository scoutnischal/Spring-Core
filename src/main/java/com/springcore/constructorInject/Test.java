package com.springcore.constructorInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/constructorInject/constructorInjectconfig.xml");
		Person infoPerson = (Person) context.getBean("personInfo");
		System.out.println(infoPerson);
	}

}
