package com.corejava.part1.app4;
class O 
{
	static int i = 10;

	static int test1()
	{
		return 20;
	}

	static int j = test1();

	static int k = test2();

	static int test2()
	{
		return 30;
	}

	static int m = j;

	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
		System.out.println(test1());
		System.out.println(test2());
	}
}
