package com.chainsys.unittest;

import com.chainsys.variables.Demoa;

/**
 * Tester class to global variable
 * @author leel3110
 * @category To Test demo class,its fields,and methods
 * date:March 24 2022
 */
public class VariableTester {
	/**
	 * Test static variable,constant,immutable variable
	 */
	public static void testImmutableVariable()
	{
		/*cannot make a static reference to the non-static field Deoma.DataB*/
		//Demoa.DataB = 123;
		/**
		 * first create an object or the class
		 * pass an int value  as  an argument to the constructor
		 * access the immutable instance field using the object reference
		 */
		Demoa firstObject = new Demoa(123);
		System.out.println(firstObject.DataB);
		/**
		 * VALUE ASSIGNED TO AN IMMUTABLE FIELD CAN NOT BE CHANGED
		 * Value for the immutable field can be assigned only through the constructor
		 */
		//firstObject.DataB=567;
	}
	public static void testGlobalVariable()
	{
		//display the value of static field
		System.out.println("DataA:"+Demoa.DataA);
		//display the value of immutable field
		//this is not possible without an object
		//System.out.println("DataB:"+Demoa.DataB);
		//display the value of constant field
		System.out.println("DataC:"+Demoa.DataC);
		//Modify value of the static field DataA
		Demoa.DataA=2345;
		System.out.println("DataA:"+Demoa.DataA);
		//Modify value of the static field DataC
		//Error:The final field Demoa.DataC cannot be assigned
		//Demoa.DataA=2345;
	}
	/***
	 * calling static method using class name
	 * without creating an object
	 * created on:25 March 2022
	 */
	public static void testStaticMethod()
	{
		Demoa.sayHello();
	}
	/**Calling non-static method using Object using Object reference
	 * Without creating an object,non-static methods can not be called
	 * created on:25 March 2022
	 * 
	 */
	public  void testNonStaticMethod()
	{
		//Error
		//Demoa.greetUser();
		Demoa firstObject = new Demoa(111);
		//call the non static method
		firstObject.greetuser();
	}
	
	
}
	

