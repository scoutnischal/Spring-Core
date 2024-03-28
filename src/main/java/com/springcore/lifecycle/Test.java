package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/democonfig.xml");
		context.registerShutdownHook();
//		Demo d = (Demo) context.getBean("demo");
//		System.out.println(d.getDemoName());

//		InterfaceDemo i = (InterfaceDemo) context.getBean("momo");

		AnnotationDemo aDemo = (AnnotationDemo) context.getBean("subject");
		System.out.println(aDemo);
	}

}
