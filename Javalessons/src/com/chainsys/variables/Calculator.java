package com.chainsys.variables;
/**
 * 
 * @author leel3110
 * created on:25 march 2022
 */

public class Calculator {
	/**
	 *Add method:takes 2 integer value using the following parameters,
	 *and will add the values.The result of totaling will be returned back to the caller
	 *This a static method object reference not required
	 *
	 *@param param1 of type int
	 *@param param2 of type int
	 *return type int
	 *
	 */
	public static int add(int param1,int param2)
	{
		int result = param1+param2;
		return result;
	}
		/**
		 *multiply method:takes 2 integer value using the following parameters,
		 *and will multiply the values.The result of totaling will be returned back to the caller
		 *This a static method object reference not required
		 *
		 *@param param1 of type int
		 *@param param2 of type int
		 *return type int
		 *
		 */
		public static int multiply(int param1,int param2)
		{
			int result = param1*param2;
			return result;
		}
		/**
		 *divide method:takes 2 integer value using the following parameters,
		 *and will divide the values.The result of totaling will be returned back to the caller
		 *This a static method object reference not required
		 *
		 *@param param1 of type int
		 *@param param2 of type int
		 *return type int
		 *
		 */
		public static int divide(int param1,int param2)
		{
			if (param2==0)
			{
				System.out.println("Invalid number");
			}
			int result = param1/param2;
			return result;
		}
		/**
		  subtract method:takes 2 integer value using the following parameters,
		 *and will divide the values.The result of totaling will be returned back to the caller
		 *This a static method object reference not required
		 *
		 *@param param1 of type int
		 *@param param2 of type int
		 *return type int
		 *
		 */
		public static int subtract(int param1,int param2)
		{
			int result = param1-param2;
			return result;
		}

}
