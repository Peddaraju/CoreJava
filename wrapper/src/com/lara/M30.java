package com.lara;

public class M30 
{
	static void test(int ... x)
	{
		System.out.println(x.length);
		for(int i : x)
		{
			System.out.println(i);
		}
		System.out.println("-------");
	}
	public static void main(String[] args) 
	{
		test();
		test(20, 30);
		test(90, 9, 20, 40);
		test(80, 2, 34, 450, 1000);
	}
}
