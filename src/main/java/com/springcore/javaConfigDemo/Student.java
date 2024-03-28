package com.springcore.javaConfigDemo;

public class Student {

	private Address address;

	public Student(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// simple method
	public void info() {
		this.address.display();
		System.out.println("Student records is here..");
	}
}
