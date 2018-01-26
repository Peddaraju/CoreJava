package com.corejava.part1.app3;
class R 
{
	public static void main(String[] args) 
	{
		int i = 0;
		System.out.println(test(i++));
		i = 0;
		System.out.println(test(++i));
	}
	static int test(int i)
	{
		return i++;
	}
}
