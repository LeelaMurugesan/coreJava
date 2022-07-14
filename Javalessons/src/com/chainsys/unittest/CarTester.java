package com.chainsys.unittest;
import com.chainsys.classandmethods.Car;
/**
 * 
 * @author leel3110
 *
 */
public class CarTester{
	public static void testCar() {
		Car firstCar = new Car("TN 1OA 001");
		firstCar.setColour("RED");
		firstCar.setFuel("Petrol");
		firstCar.setYearOfpurchase(2022);
		System.out.println(firstCar.getRegisterNumber());
		System.out.println(firstCar.getColour());
		System.out.println(firstCar.getFuel());
		System.out.println(firstCar.getYearOfpurchase());
		
	}
}
