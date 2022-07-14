package com.chainsys.arrays;

public class Employee {
	private final long id;
	private String name;
	//constructor
	public Employee(long v1) {
		this.id=v1;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public long getId() {
		return id;
	}
}


