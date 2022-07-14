package com.chainsys.unittest;

import com.chainsys.interfaces.ICalculator;
import com.chainsys.interfaces.Calculator;

public class TestInterfaceCalculator {
	public static void main(String args[]) {
		Calculator c1= new Calculator();
		int output= c1.add(8, 4);
		System.out.println(output);
		output = c1.multiply(8, 4);
		System.out.println(output);
		output = c1.divide(8, 4);
		System.out.println(output);
	}
	/*
	 * marker Interface
	 */
public static void testmarker() {
	
	Calculator c1=new Calculator();
	if( c1 instanceof ICalculator)
	{
		ICalculator c= new Calculator();
		int out = 0;
		out =c.add(8,4);
		System.out.println(out);
		out=c.multiply(8,4);
		System.out.println(out);
		out=c.divide(8,4);
		System.out.println(out);
}
	else
	{
		System.out.println(c1.getClass().getName()+"does not implement ICalculator");
	}
}
}
