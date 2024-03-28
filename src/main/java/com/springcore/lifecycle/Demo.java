package com.springcore.lifecycle;

public class Demo {
	private String demoName;

	public String getDemoName() {
		System.out.println("Get |Demo Name");
		return demoName;
	}

	public void setDemoName(String demoName) {
		System.out.println("Set the DemoName");
		this.demoName = demoName;
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Demo [demoName=" + demoName + "]";
	}

	public void init() {
		System.out.println("Initialized Bean");
	}

	public void destory() {
		System.out.println("Bean Destory!!");
	}

}
