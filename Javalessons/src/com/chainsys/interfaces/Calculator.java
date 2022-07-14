package com.chainsys.interfaces;

public class Calculator implements ICalculator{

	@Override
	public int add (int v1, int v2) {
		System.out.println("Addition value : ");
		return (v1+v2);
	}

	@Override
	public int multiply(int v1, int v2) {
		System.out.println("Multiplication value: ");
		return (v1*v2);
	}

	@Override
	public int divide(int v1, int v2) {
		{
			if(v2==0)
			{
				System.out.println("v2 value should not greater than zero");
				return 0;
			}
		}
		System.out.println("Division value:");
		return (v1/v2);
	}

}
