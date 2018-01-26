package com.corejava.part1.app3;
class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main1");
		test();
		System.out.println("main2");
	}
	static void test()
	{
		System.out.println("test1");
		if(true)
		{
			System.out.println("if block");
			return;
		}
		System.out.println("test2");
	}
}
