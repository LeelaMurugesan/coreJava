package com.chainsys.unittest;

import com.chainsys.variables.Bank;
/**
 * 
 * @author leel3110
 *
 */
public class BankTester {

	public static void testDeposit() {
		System.out.println("Before Balance " + Bank.currentbalance);
		Bank.deposit(10000);
		System.out.println("After Balance " + Bank.currentbalance);
	}

	public static void testWithdraw() {
		System.out.println("Before Balance " + Bank.currentbalance);
		int withdraw = Bank.withdraw(5000);
		System.out.println("total amount is" + withdraw);
		System.out.println("After Balance " + Bank.currentbalance);
	}

	public static void testOpenaccount() {
		Bank.openAccount("Apple", 1234565432);
		System.out.println(Bank.customerName);
		System.out.println(Bank.accountNumber);

	}
}