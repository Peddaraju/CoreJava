package com.corejava.part1.app4;
class D 	
{
	static void test() 
	{
	    System.out.println("from test:" + i);
	}

	static int i;

	public static void main(String[] args)
	{
	    System.out.println("from main:" + i);
		i = 10;
		test();
	}
}
