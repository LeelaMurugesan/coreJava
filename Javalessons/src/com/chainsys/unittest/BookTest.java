package com.chainsys.unittest;
import com.chainsys.classandmethods.Book;

public class BookTest {
	public static void testName() {
		Book firstBook = new Book(1234);
		firstBook.setName("oops");
		System.out.println(firstBook.getName());
	}
	public static void testauthor() {
		Book firstBook = new Book(1234);
		firstBook.setAuthor("Willam Stalling");
		System.out.println(firstBook.getAuthor());
	}
	public static void testRate() {
		Book firstBook = new Book(1234);
		firstBook.setRate(580);
		System.out.println(firstBook.getRate());
	}
	public static void testPublicationyear() {
		Book firstBook = new Book(1234);
		firstBook.setPublicationyear(1999);
		System.out.println(firstBook.getPublicationyear());
	}

}
