package com.chainsys.classandmethods;
/**
 * 
 * @author leel3110
 *
 */
public class Car {
	private int yearOfpurchase;
	private String colour;
	private String fuel;
	private final String registerNumber;
	public Car(String registernumber)
	{
		this.registerNumber = registernumber;
	}
	public int getYearOfpurchase() {
		return yearOfpurchase;
	}
	public void setYearOfpurchase(int yearOfpurchase) {
		this.yearOfpurchase = yearOfpurchase;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getRegisterNumber() {
		return registerNumber;
	}
	
	

}
