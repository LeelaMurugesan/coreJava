package com.chainsys.unittest;
import com.chainsys.test.Bank;

public class BankTest {
		public static void testName() {
			Bank sc = new Bank(1234);
			sc.setName("Ruby");
			System.out.println(sc.getName());
		}
		public static void testAccountNumber() {
			Bank sc = new Bank(1234);
			sc.setAccountnumber("1234567896541");
			System.out.println(sc.getAccountnumber());
		}
		public static void testAddress() {
			Bank sc = new Bank(1234);
			sc.setAddress("Anna Nagar,Chennai");
			System.out.println(sc.getAddress());
		}
		public static void testPhonenumber() {
			Bank sc = new Bank(1234);
			sc.setPhonenumber("9876501234");
			System.out.println(sc.getPhonenumber());
		}
		public static void testEmailid() {
			Bank sc = new Bank(1234);
			sc.setEmailid("xyz@gmail.com");
			System.out.println(sc.getEmailid());
		}

	}

