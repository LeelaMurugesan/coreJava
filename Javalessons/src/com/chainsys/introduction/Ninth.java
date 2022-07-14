package com.chainsys.introduction;

import java.util.Scanner;

public class Ninth 
{
	public static void main(String[]args) {
	//findEvenNumbers();
		swapNumbers();
}
public static void findEvenNumbers()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any 10 digit number:");
	long value = sc.nextLong();
	sc.close();
	long num = value;
	long reminder=0;
	while(num>0) {
		reminder = num%10;
		if(reminder%2==0) {
			System.out.println(reminder);
		}
		num=num/10;
}
}
public static void swapNumbers() {
	int x=10;
	int y=20;
	System.out.println("x:"+x +"y:"+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("x:"+x +"y:"+y);
	
}
}
