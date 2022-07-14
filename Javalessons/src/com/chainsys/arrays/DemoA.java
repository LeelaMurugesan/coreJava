package com.chainsys.arrays;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author leel3110
 * created on:Apr 1 2022
 */

public class DemoA {
public static void creatingSingleDimensionArrays()
	{
		int firstintArray[]=new int[10];
		//int secondintArray[4]={1,2,3,4};
		int secondintArray[]= {1,2,3,4};
		System.out.println(firstintArray);
		System.out.println(secondintArray);
		
		
	}
public static void creatingArrays() {
//	int firstValue=100;
	int[] numbers= {10,20,30,40,50};
	int lengthOfnumbers=numbers.length;
	System.out.println("length of numbers="+lengthOfnumbers);
	for(int x:numbers) {
		System.out.println(x +",");
	}
	System.out.println();
}
public static void creatingAnotherArray() {
	//Object obj=new Object();
	//int x=obj.length;//reading from a property
	//obj.length();//calling a method
	// an array is declared,but not instantiated
	//here days is a reference
	//it will be null now
	int days[]=null;
	if(days==null) {
		System.out.println("Days IS NULL");
	}
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter size for days");
	int size=scanner.nextInt();
	scanner.close();
	//the days
	days=new int[size];
	if(days!=null) {
		System.out.println("Days is Not Null");
	}
	int lengthofdays=days.length;
	System.out.println("No of Days"+lengthofdays);
	for(int i=0;i<lengthofdays;i++) {
		days[i]=(int)(Math.random()*10);
	}
	for(int x:days) {
		System.out.println(x);
	}

}
public static void createMonthArray() {
/**	int month[]=new int[12];
	int lengthofmontharray=month.length;//12
	System.out.println("Array length is:"+lengthofmontharray);
	for(int i=0;i<lengthofmontharray;i++) {
		System.out.println(i+"-"+month[i]+",");//month will be zero
		}
	System.out.println();
	month[2]=31;
	for(int i=0;i<lengthofmontharray;i++) {
		System.out.println(i+"-"+month[i]+",");
		}
	//month[12]=31;
	month[11]=31;//upper index is length -1
	try {
		month[12]=31;
		System.out.println("Hi....");
		//month[11]=31;//upper index is length -1
	}catch(Exception err) {
		System.out.println("Error!!!"+err.getMessage());
	}**/
	
	int anotherMonth[]= {31,28,31,30,31,30,31,31};
	int lengthofmontharray=anotherMonth.length;
	System.out.println("Array length is:"+lengthofmontharray);
	for(int i=0;i<lengthofmontharray;i++) {
		System.out.println(i+"-"+anotherMonth[i]+",");
	}
	
	}
	public static void workingWithArraysClass() {
		int numberArray[]=new int[10];
		for(int i=0;i<10;i++) {
			numberArray[i]=-3*i;
			}
		System.out.println("original contents:");
		int lengthofthearray=numberArray.length;
		System.out.println("Array length is:"+lengthofthearray);
		for(int i=0;i<lengthofthearray;i++) {
			System.out.print(numberArray[i]+"");
		}
		System.out.println();
		Arrays.sort(numberArray);
		System.out.println("sorted:");
		for(int i=0;i<lengthofthearray;i++) {
			System.out.print(numberArray[i]+"");
		}
		System.out.println();
		Arrays.fill(numberArray,2,6,-1);//from index 2 to index 5
		System.out.println("After fill():");
		for(int i=0;i<lengthofthearray;i++) {
			System.out.print(numberArray[i]+"");
		}
		System.out.println();
		int index=Arrays.binarySearch(numberArray,-9);
		 System.out.println(index);//wrong value
		Arrays.sort(numberArray);
		for(int i=0;i<lengthofthearray;i++) {
			System.out.print(numberArray[i]+"");
		}
		System.out.println();
		 index=Arrays.binarySearch(numberArray,-9);
		 System.out.print(index);
		}
	public static void WorkingWithCharArray() {
		String s1="Today is a very cold day";
		char[] data=s1.toCharArray();
		int count=data.length;
		System.out.println("Array length"+count);
		for(int i=0;i<count;i++) {
			System.out.println(data[i]+" "+(int)data[i]);
		}
	}
}

	


