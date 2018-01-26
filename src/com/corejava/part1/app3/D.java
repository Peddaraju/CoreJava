package com.corejava.part1.app3;
class D 
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
		return;
		//System.out.println("test2");
	}
}
