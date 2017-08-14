package com.app;

public class B 
{
	public static void main(String[] args) 
	{
		String s1 = "a1b2c3a1b5";
		System.out.println(s1.length());
		System.out.println("---");
		System.out.println(s1.indexOf('z'));
		System.out.println("-------");
		System.out.println(s1.lastIndexOf('1'));
		System.out.println("----------");
		System.out.println(s1.lastIndexOf('b', 4));
		System.out.println("-----------");
		System.out.println(s1.lastIndexOf("a1b", 9));
		System.out.println("-------------");
		System.out.println(s1.lastIndexOf("a1b2", 9));
	}
}
