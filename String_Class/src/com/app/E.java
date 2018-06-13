package com.app;

public class E 
{
	public static void main(String[] args) 
	{
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "xyz";
		System.out.println(s1.compareTo(s2));
		System.out.println("================");
		System.out.println(s1.compareTo(s3));
		System.out.println("===============");
		String s4 = "Lara";
		String s5 = "lara";
		System.out.println(s4.compareTo(s5));
		System.out.println("=================");
		System.out.println(s4.compareToIgnoreCase(s5));
		System.out.println("done");		
	}
}
