package com.chainsys.variables;
/***
 * 
 * @author leel3110
 * created on 25 March 2022
 */
public class Bank{
	public static int currentbalance;
	public static String customerName;
	public static int accountNumber;
	
	public  static void deposit(int parmamount) {
		currentbalance = currentbalance +parmamount;
	}
	public static int withdraw(int parmamount) {
		currentbalance = currentbalance -parmamount;
		return parmamount;
	}
	public static void openAccount(String parmname,int parmAccountNumber) {
		customerName = parmname;
		accountNumber = parmAccountNumber;
		

}
}