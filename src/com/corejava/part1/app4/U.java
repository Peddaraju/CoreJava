package com.corejava.part1.app4;
class U 
{
	static int i = test();
	static int test()
	{
		main(null);
		System.out.println("test:" + i);
		return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("main:" + i);
		i = 10;
	}
}
