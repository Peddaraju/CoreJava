package com.corejava.part1.app4;
class S 
{
	static int i = 10;
	static int j = i;
	static int k = test1();
	static int m = test2();
	static int p = 20;

	static int test1()
	{
		System.out.println("from test1");
		System.out.println("----------");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
		System.out.println(p);
		return j;
	}

	static int test2()
	{
		System.out.println("from test2");
		System.out.println("----------");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
		System.out.println(p);
		return p;
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
		System.out.println("----------");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
		System.out.println(p);	
	}
}
