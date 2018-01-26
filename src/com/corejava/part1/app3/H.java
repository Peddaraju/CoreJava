package com.corejava.part1.app3;
class H 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		test();
		int i = 10 + test();
		System.out.println(i);
		System.out.println(test());
	}
	static int test()
	{
		System.out.println("from test");
		return 5;
	}
}
