package com.app;

public class T 
{
	public static void main(String[] args) 
	{
		String s = "a1b2c3h4z9";
		String [] x = s.split("[0-4]");
		for(String s1:x)
		{
			System.out.println(s1);
		}
		System.out.println("========================");
		String [] y = s.split("[a-c]");
		for(String s2:y)
		{
			System.out.println(s2);
		}
	}
}
