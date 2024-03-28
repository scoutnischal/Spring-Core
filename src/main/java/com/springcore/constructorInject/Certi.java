package com.springcore.constructorInject;

public class Certi {
	private String name;

	public Certi(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Certificate Name:" + this.name;
	}
}
