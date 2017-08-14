package com.app;

public class O 
{
	public static void main(String[] args) 
	{
		String s1 = "java";
		String s2 = "ja";
		String s3 = "va";
		String s4 = s2 + s3;
		System.out.println(s1.toString());
		System.out.println(s4.toString());
		System.out.println("---------------");
		System.out.println(s1 == s4);
		System.out.println("----------------------");
		System.out.println(s1.equals(s4));
		System.out.println("done");
	}
}
