package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationDemo {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public AnnotationDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AnnotationDemo [subject=" + subject + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("Start Method");
	}

	@PreDestroy
	public void end() {
		System.out.println("End Method");
	}
}
