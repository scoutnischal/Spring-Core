package com.springcore.standaloneDemo;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friendLists;
	private Map<String, Integer> feeStructure;
	private Properties dbProperties;

	public List<String> getFriendLists() {
		return friendLists;
	}

	public void setFriendLists(List<String> friendLists) {
		this.friendLists = friendLists;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	public Properties getDbProperties() {
		return dbProperties;
	}

	public void setDbProperties(Properties dbProperties) {
		this.dbProperties = dbProperties;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [friendLists=" + friendLists + ", feeStructure=" + feeStructure + ", dbProperties="
				+ dbProperties + "]";
	}

}
