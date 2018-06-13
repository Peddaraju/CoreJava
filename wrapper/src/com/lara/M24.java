package com.lara;
public class M24 
{
	static void test(int i)
	{
		System.out.println("int");
	}
	static void test(Double d)
	{
		System.out.println("Double");
	}
	public static void main(String[] args) 
	{
		Integer obj = new Integer(90);
		test(obj);
		double d1 = 90.09;
		test(d1);		
	}
}
