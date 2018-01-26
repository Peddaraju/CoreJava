package com.corejava.part1.app6;
class H 
{
	static int i = test();
	static int j = 10;
	static int test()	
	{
		return j;
	}
	public static void main(String[] args) 	
	{
		System.out.println(i);
		System.out.println(j);
	}
}
