package com.chainsys.collectionreferencework;

//import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String args[]) {
		TreeSet<String> set = new TreeSet<String>();// Dta is unordered and sorted alphabetically
		//HashSet<String> set = new HashSet<String>();
		set.add("John");
		set.add("Jennie");
		set.add("Ruby");
		set.add("Simon");
		set.add("Marie");
		set.add("Ruby");
		set.add("Abi");
		
		//Data is unique,no redundancy of data
		//data is unordered in output due to hashing
		System.out.println("Set is : "+set);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		set.remove("John");
		System.out.println("Set after removed John is:"+set);
		System.out.println(set);
		if(set.contains("Marie")) {
			System.out.println("Marie is in the set");
		}
		System.out.println("Set size:"+set.size());
	}

}
