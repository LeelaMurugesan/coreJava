package com.chainsys.classandmethods;

public class Book {
		private final int bookId;
		private String name;
		private  String author;
		private int rate;
		private int publicationyear;
		//construct
	    public Book(int id) {
	    	this.bookId=id;

	}
		public int getBookId() {
			return bookId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getRate() {
			return rate;
		}
		public void setRate(int rate) {
			this.rate = rate;
		}
		public int getPublicationyear() {
			return publicationyear;
		}
		public void setPublicationyear(int publicationyear) {
			this.publicationyear = publicationyear;
		}


}
