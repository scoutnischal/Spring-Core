package com.springcore.constructorInject;

import java.util.List;

public class Person {
	private String name;
	private int age;
	private Certi objCerti;
	private List<String> list;

	public Person(String name, int age, Certi obCerti, List<String> list) {
		this.name = name;
		this.age = age;
		this.objCerti = obCerti;
		this.list = list;
	}

	@Override
	public String toString() {
		return "name:" + this.name + "||" + "age:" + this.age + "||" + this.objCerti + "List:" + this.list;
	}
}
