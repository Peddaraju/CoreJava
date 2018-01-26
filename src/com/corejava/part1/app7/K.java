package com.corejava.part1.app7;
class K 
{
	static int i;
	static int j = 10;
	static
	{
		System.out.println("SIB:" + i);
		System.out.println("SIB:" + j);
		i = 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(i);
		System.out.println(j);
		System.out.println("main end");
	}
}
