package com.chainsys.unittest;

import com.chainsys.variables.Calculator;

/**
 * Tester class to global variable
 * @author leel3110
 * @category To Test demo class,its fields,and methods
 * date:March 24 2022
 * This class is for unit testing the calculator class and its methods
 * method to test
 * add(param1,param2)
 * multiply(param1,param2)
 * divide(param1,param2)
 * subtract(param1,param2)
 */
public class CalculatorTester {
	/***
	 * calling static method using class name
	 * without creating an object,non-static methods can not be allowed
	 * created on:25 March 2022
	 * 
	 */
	public static void testAdd()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.add(arg1, arg2);
		System.out.println("Result of Add is:"+output);
		
	}
	public static void testMultiply()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.multiply(arg1, arg2);
		System.out.println("Result of multiply is:"+output);
		
	}
	public static void testDivide()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.divide(arg1, arg2);
		System.out.println("Result of divide is:"+output);
		
	}
	public static void testSubtract()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.subtract(arg1, arg2);
		System.out.println("Result of divide is:"+output);
		
	}
}
