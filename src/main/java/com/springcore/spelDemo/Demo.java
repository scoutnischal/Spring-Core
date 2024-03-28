package com.springcore.spelDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demo")
public class Demo {
	@Value("#{50+85}")
	private int x;

	// simple expression
	@Value("#{50+85}")
	private int y;

	// simple method called
	@Value("#{T(java.lang.Math).sqrt(50)}")
	private double sqrt;

	// simple variable called
	@Value("#{T(java.lang.Math).PI}")
	private double piValue;

	// create an object of another package
	@Value("#{new java.lang.String('Nischal Shakya')}")
	private String name;

	// simple boolean type demo
	@Value("#{ 80>25 }")
	private boolean isActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getSqrt() {
		return sqrt;
	}

	public void setSqrt(double sqrt) {
		this.sqrt = sqrt;
	}

	public double getPiValue() {
		return piValue;
	}

	public void setPiValue(double piValue) {
		this.piValue = piValue;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", sqrt=" + sqrt + ", piValue=" + piValue + ", name=" + name
				+ ", isActive=" + isActive + "]";
	}

}
