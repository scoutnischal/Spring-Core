package com.springcore.stereotypeDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/stereotypeDemo/stereoconfig.xml");

		Student student = (Student) context.getBean("student");
		System.out.println(student);
		Student s1 = (Student) context.getBean("student");
		System.out.println(student.hashCode());
		System.out.println(s1.hashCode());
	}

}
