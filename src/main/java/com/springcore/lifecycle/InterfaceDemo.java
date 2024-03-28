package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InterfaceDemo implements InitializingBean, DisposableBean {

	private double momoprice;

	public double getMomoprice() {
		return momoprice;
	}

	public void setMomoprice(double momoprice) {
		System.out.println("set momo / ready momo");
		this.momoprice = momoprice;
	}

	public InterfaceDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "InterfaceDemo [momoprice=" + momoprice + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Momo Order");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Finish Momo");
	}

}
