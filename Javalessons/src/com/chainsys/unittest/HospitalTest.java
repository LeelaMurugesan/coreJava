package com.chainsys.unittest;

import com.chainsys.classandmethods.Hospital;

public class HospitalTest {
		public static void testpatientName() {
			Hospital firstEmployee = new Hospital(1234);
			firstEmployee.setName("robin");
			System.out.println(firstEmployee.getName());
		}
		public static void testCity() {
			Hospital firstEmployee = new Hospital(1234);
			firstEmployee.setCity("Chennai");
			System.out.println(firstEmployee.getcity());
		}
		public static void testRate() {
			Hospital firstEmployee = new Hospital(1234);
			firstEmployee.setRate(5800);
			System.out.println(firstEmployee.getRate());
		}
		public static void testdays() {
			Hospital firstEmployee = new Hospital(1234);
			firstEmployee.setdays(12);
			System.out.println(firstEmployee.getdays());
		}
}



