package com.corejava.part1.app2;
class Z 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int i = 10;
		test(i, i + 20);
	}
	static void test(int p, int q)
	{
		System.out.println("from test:" + p);
		System.out.println("from test:" + q);
	}
}
