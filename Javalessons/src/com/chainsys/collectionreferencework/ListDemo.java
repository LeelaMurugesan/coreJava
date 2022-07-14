package com.chainsys.collectionreferencework;

import java.util.ArrayList;
import java.util.Iterator;
class Student{
	int roll;
	String name;
}

public  class ListDemo extends Student {
	public static void main(String args[]) {
		//s1 can only store String objects
		ArrayList<String> s1 = new ArrayList<String>();
		//s2 can store any type of data
		ArrayList  s2 = new ArrayList();
		
		Student s3 = new Student();
		s3.name = "Mike";
		s3.roll = 101;
		//adding data in list
		s1.add("John");
		s1.add("Priya");
		s1.add("Marie");
		s1.add("Priya");
		
		s2.add("John");
		s2.add(10);
		s2.add(2.2);
		s2.add(s3);
		
		System.out.println("List1 is"+s1);
		System.out.println("List2 is"+s2);
		
		//Getting the element
		String name = s1.get(2);
		System.out.println("Name is : "+ name);
		
		Object obj = s2.get(2);
		System.out.println(" object is :"+obj);
		// updating the list
		s1.set(0, "Ruby");
		System.out.println(s1);
		
		//remove the element
		s1.remove(0);
		System.out.println(s1);
		
		//remove all
		//s1.clear();
		
		if(s1.contains("Marie")) {
			System.out.println("Marie is in the list");
		}
		
		//Iterate in ArrayList
		System.out.println("==Iterating with Enhanced for loop==");
		for(int i=0;i<s1.size();i++) {
			System.out.println(s1.get(i));
		}
		System.out.println("==Iterating with Enhanced for loop==");
		for(String str : s1) {
			System.out.println(str);
		}
		System.out.println("========");
		// Iterator 
		Iterator<String> itr = s1.iterator();
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		//Using while loop
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			if(str.equals("Marie")) {
				itr.remove();
			}
		}
		System.out.println("=======");
		System.out.println("list:"+s1);
		
	
		}
	
	

}