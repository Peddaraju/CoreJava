package com.corejava.part1.app8;
class D
{
	static int i;

	static void test()
	{
		System.out.println("D.test:" + i);
	}

	static
	{
		i = 10;
		System.out.println("D.SIB");
	}
}
class E1 
{
	static int j = 30;

	static
	{
		System.out.println("E1.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(j);
		D.test();
		D.i = 4;
		j = 2;
		System.out.println(j);
		D.test();
		System.out.println("main end");
	}
}
