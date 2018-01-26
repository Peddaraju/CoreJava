package com.corejava.part1.app6;
class F1
{
	static int i;
	static void test()
	{
		System.out.println("i am from test");
		i = 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("a:" + i);
		test();
		System.out.println("b:" + i);
	}
}
