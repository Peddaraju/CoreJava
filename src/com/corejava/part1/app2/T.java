package com.corejava.part1.app2;
class T
{
	public static void test1()
	{
		System.out.println("from test1");
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
		test2();
		test1();
		test2();
	}
	public static void test2()
	{
		System.out.println("from test2");
	}
}
