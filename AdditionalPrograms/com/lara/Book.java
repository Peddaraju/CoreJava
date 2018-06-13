package com.lara;
class Book 
{
	 int id;
	 String authorName;
	 int pages;
	 Book() 
	 {
	 }
	 Book(int id, String authorName, int pages)
	 {
		 this.id = id;
		 this.authorName = authorName;
		 this.pages = pages;
	 }
	 void display()
	 {
		 System.out.println(id + ":" + authorName + ":" + pages);
	 }
	 public static void main(String[] args) 
	 {
		 Book b1 = new Book(12, "xyz", 243);
		 Book b2 = new Book();
		 b2.id = b1.id;
		 b2.authorName = b1.authorName;
		 b2.pages = b1.pages;
		 b1.display();
		 b2.display();
	 }
	 
}
