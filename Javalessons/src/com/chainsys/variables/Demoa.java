package com.chainsys.variables;

public class Demoa {
	public static int DataA;
	//Static global variable
	public final int DataB;//Immutable global non static
	public final static int DataC=300;//CONSTANT
	//Constructor
	/*
	 * constructor:is  a special method
	 * The name of the constructor and name of the class will be same
	 * constructor don't have return type
	 * constructor can take parameters
	 */
	public Demoa(int dataB)
	{/*Assigning value to the global read only field(this.DataB)*/
		this.DataB=dataB;
	}
	/**
	 * static method can be called without an object
	 */
	public static void sayHello()
	{
		System.out.println("Hello Developers ");
	}
	/**
	 * greet
	 */
	public void greetuser()
	{
		System.out.println("Greeting User! ");
	}

}
