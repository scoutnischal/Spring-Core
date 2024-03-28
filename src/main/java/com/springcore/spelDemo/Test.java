package com.springcore.spelDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spelDemo/spelconfig.xml");
		Demo demo = (Demo) context.getBean("demo");

		System.out.println(demo);

		// using api for spEL

		SpelExpressionParser temp = new SpelExpressionParser();
		Expression ex = temp.parseExpression("4+5");
		System.out.println(ex.getValue());
	}

}
