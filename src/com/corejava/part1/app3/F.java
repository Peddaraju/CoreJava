package com.corejava.part1.app3;
class F 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int i = test();
		System.out.println(i);
	}
	static int test()
	{
		System.out.println("from test");
		return 10;
	}
}
