package com.chainsys.strings;

public class StringLessonA {
	public static void lessonOne()
	{
		String firstString = "ChainSys";
		System.out.println(firstString );
		char dateOne[]={'C','h','a','i','n'};
		String secondString = new String(dateOne);
		System.out.println(secondString );
		String thirdString = new String(new char[]{'C','h','a','i','n'});
		System.out.println(thirdString );
	}
	public static void lessonTwo() {
		String firstString="Hello";
		String secondString="Hello";
		String thirdString="Hello";
		int firstNumber = 100;
		int secondNumber = 100;
		int thirdNumber = 100;
		System.out.println(firstString );
		System.out.println(secondString );
		System.out.println(thirdString );
		System.out.println(firstNumber );
		System.out.println(secondNumber );
		System.out.println(thirdNumber );
		firstString="Welcome";
		System.out.println(firstString );
		System.out.println(secondString );
		
	}
	public static void creatingStringInaForLoop() {
		for(int count=0;count<10;count++) {
		//	String s1="Hello";
		}
	}
	public static void stringToCharArray() {
		java.util.Scanner scanner= new java.util.Scanner(System.in);
		System.out.println("Enter a WORD" );
		String firstString = scanner.nextLine();
		scanner.close();
		int stringlength=firstString.length();
		System.out.println("Length "+stringlength);
		char [] data = firstString.toCharArray();
		int dataarraylength=data.length;
		System.out.println("Length "+dataarraylength);
		
	}
	public static void stringToUpperLower() {
		java.util.Scanner scanner= new java.util.Scanner(System.in);
		System.out.println("Enter a WORD" );
		String firstString = scanner.nextLine();
		scanner.close();
		System.out.println(firstString);
		String stringInUppercase=firstString.toUpperCase();
		System.out.println("toUpperCase "+stringInUppercase);
		System.out.println("s1="+firstString );
		String stringInLowercase=firstString.toLowerCase();
		System.out.println("toLowerCase "+stringInLowercase);
		System.out.println("s1="+firstString );
		//Substring
		//from the 4th char till end
		String substring=firstString.substring(3);
		System.out.println(substring );
		//from 3rd char to 6th chat (i.e excluding 7th char)
		//from index 2 to index 5
		substring=firstString.substring(2,6);
		System.out.println(substring );
		//replace
		String replacedstring=firstString.replace('a','e');
		System.out.println(replacedstring );
		//equals
		boolean flag1=firstString.equals(stringInUppercase);
		System.out.println(flag1);
		boolean flag=firstString.equalsIgnoreCase(stringInUppercase);
		System.out.println(flag);
		
		}
	public static void testStringTrim() {
		String secondString ="    Hope   it   rain";
		System.out.println("Before Trim:"+secondString.length());
		secondString=secondString.trim();
		System.out.println("After Trim:"+secondString.length());
	}
	public static void testSplit() {
		String firstString =" Tom and Jerry are good friends  "	;
		String trimmedString = firstString.trim();
		String[] data=trimmedString.split(trimmedString);
		int count = data.length;
		System.out.println("Word Count"+count);
		for(int index=0;index<count;index++) {
			System.out.println(data[index]);
		}
		}
	public static void testSplitDays() {
		String weekdays = "mon;tue;wed;thu;fri;sat,sun";
		String[] data=weekdays.split(";");
		int count = data.length;
		System.out.println("Days Count"+count);
		for(int index=0;index<count;index++) {
			System.out.println(data[index]);
		}
	}
	public static void reverse() {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence="";
		try {
			sentence=scanner.nextLine();
		}finally {
			scanner.close();
		}
		String[] a=sentence.split(" ");
	    int count=a.length;
	    
		while(count>0) {
			System.out.print(a[count-1] +" ");
			count--;
		}
		}
		public static void verifyString(String s1)
		{
			if(null==s1)
			{
				System.out.println("String is Null ");
				return;
			}
			else
				System.out.println("String is NOT Null "+s1);
			if(!s1.isEmpty())
				System.out.println(" Not Empty"+s1);
			else
				System.out.println(" String is Empty ");
			
			}
		
			
	}

	
		
	


