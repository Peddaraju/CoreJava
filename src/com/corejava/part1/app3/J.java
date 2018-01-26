package com.corejava.part1.app3;
class J 
{
	public static void main(String[] args) 
	{
		int i = test1();
		int j = test2();
		System.out.println(test1());
		System.out.println(test2());
		int k = i + j + test1() + test2();
		System.out.println(k);
	}
	static int test1()
	{
		return 2;
	}
	
	static int test2()
	{
		return 5;
	}
}
