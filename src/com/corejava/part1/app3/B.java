package com.corejava.part1.app3;
class B 
{
	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println("a:" + i);
		test(i);
		System.out.println("b:" + i);
	}
	static void test(int i)
	{
		i = 20;
	}
}
