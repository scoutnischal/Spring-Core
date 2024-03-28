package com.springcore.autowire.annotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	// Qualifier for choose a bean from a multiple bean to inject the object
	@Qualifier("address1")
	private Address address;

	public Address getAddress() {
		return address;
	}

	// for calling setter method
	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
	}

	// for calling constructor using @Autowired
	public Employee(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
