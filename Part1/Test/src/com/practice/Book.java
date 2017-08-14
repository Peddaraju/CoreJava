package com.practice;

public class Book {

	int id;
	String bookName;
	int pages;
	
	public Book(int id, String bookName, int pages) {
		this.id = id;
		this.bookName = bookName;
		this.pages = pages;
	}
	public Book() {	}
	public Book(Book b) {
		this.id = b.id;
		this.bookName = b.bookName;
		this.pages = b.pages;
	}
	
	public void display(){
		System.out.println(id +"-"+bookName+"-"+pages);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Book b1 = new Book(1,"raju",34);
		b1.display();
		Book b2 = new Book(b1);
		b2.display();
		
		
		
	}
}
