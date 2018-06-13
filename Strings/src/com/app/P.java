package com.app;

public class P 
{
	public static void main(String[] args) 
	{
		String s1 = null;
		System.out.println(s1);
		System.out.println("-----------");
		s1 = s1 + s1 + null;
		System.out.println(s1);
		System.out.println("done");
	}
}
