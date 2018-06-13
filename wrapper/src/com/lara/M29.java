package com.lara;

public class M29 
{
	/*
	static void test()
	{
		System.out.println("test()");
	}
	*/
	static void test(int ... x)
	{
		System.out.println("int...");
	}
	public static void main(String[] args) 
	{
		test();
		test(10);
		test(20, 30);
		test(20, 30, 3, 50, 60);
	}
}
