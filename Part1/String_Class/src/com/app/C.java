package com.app;

public class C 
{
	public static void main(String[] args) 
	{
		String s1 = "lara technology";
		String s2 = s1.substring(5);
		String s3 = s1.substring(5,9);
		String s4  = s2.intern();
		String s5 = s1.intern();
		boolean s6 = s1.isEmpty();
		System.out.println(s1);
		System.out.println("-----");
		System.out.println(s2);
		System.out.println("---------");
		System.out.println(s3);
		System.out.println("---------------");
		System.out.println(s4);
		System.out.println("----------------------");
		System.out.println(s5);
		System.out.println("---------------------------");
		System.out.println(s6);
		System.out.println("=================================");
		
		String s = "";
		boolean b1=s.isEmpty();
		System.out.println(b1);
	}
}
