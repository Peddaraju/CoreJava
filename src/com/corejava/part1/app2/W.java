package com.corejava.part1.app2;
class W 
{
	static void test1()
	{
		System.out.println("test1 begin");
		test2();
		System.out.println("test1 end");
	}
	static void test2()
	{
		System.out.println("test2 begin");
		test3();
		System.out.println("test2 end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test2();
		System.out.println("=====");
		test1();
		System.out.println("main end");
	}
	static void test3()
	{
		System.out.println("from test3");//5, 13
	}
}
