package com.corejava.part1.app3;
class C 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println(":main end");
	}
	static void test()
	{
		System.out.println("test");
		return;
	}
}
