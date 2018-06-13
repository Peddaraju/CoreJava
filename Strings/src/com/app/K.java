package com.app;

public class K 
{
	public static void main(String[] args) 
	{
		String s1 = "LARA";
		String s2 = "lara";
		System.out.println(s1.equals(s2));
		System.out.println("============");
		System.out.println(s1.equals(s2.toUpperCase()));
		System.out.println("=====================");
		System.out.println(s1.toLowerCase().equals(s2));
		System.out.println("==========================");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println("done");
	}
}
