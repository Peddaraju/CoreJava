package com.corejava.part1.app8;
class B 
{
	static int i;
	static int j = 10;
	static	
	{
		System.out.println("B-SIB");
	}
	static void test() 
	{
	    System.out.println("from test");
	}
	public static void main(String[] args) 	
	{
	    System.out.println("main begin");
	    test();
	    System.out.println("main end");
	}
}
