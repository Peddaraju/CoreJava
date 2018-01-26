package com.corejava.part1.app4;
class R 
{
	static int i = test();

	static int test()
	{
		System.out.println("from test");
		return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("from main:" + i);
	}
}
