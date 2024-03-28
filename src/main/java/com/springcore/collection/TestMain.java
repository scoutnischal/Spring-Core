package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/collection/collectionconfig.xml");
		Emp emp1 = (Emp) context.getBean("emp1");

		System.out.println("Address:" + emp1.getAddresses());
		System.out.println(emp1);
	}

}
