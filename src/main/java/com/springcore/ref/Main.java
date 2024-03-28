package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/referenceconfig.xml");

		A refA = (A) context.getBean("aRef");
		// print the value of x from a A class
		System.out.println(refA.getX());

		// print the value of y from a B class
		System.out.println(refA.getObj().getY());

		System.out.println(refA);

	}

}
