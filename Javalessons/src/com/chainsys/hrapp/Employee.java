package com.chainsys.hrapp;
/**
 * 
 * @author leel3110
 *
 */

public class Employee {
	private int ID;
	private String name;
	private double salary;
	public Employee(int iD, String name, double salary) {
	//	this.ID = ID;
		this.name = name;
		this.salary = salary;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Employee:"+ getID() +""+getName()+""+getSalary();
	}
	

}
