package com.corejava.part1.app3;
class K 
{
	public static void main(String[] args) 
	{
		int i = 10;
		i = test(i);
		System.out.println(i);
	}
	static int test(int i)
	{
		i = 20;
		return i;
	}
}
