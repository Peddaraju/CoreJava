package com.app;

public class A 
{
	public static void main(String[] args) 
	{
		String s1 = "a1b2c3x1y2x3";
		System.out.println(s1.length());
		System.out.println(s1.indexOf('2'));
		System.out.println(s1.indexOf('x'));
		System.out.println(s1.indexOf('x',8));
		System.out.println(s1.indexOf(2, 3));
	}
}
