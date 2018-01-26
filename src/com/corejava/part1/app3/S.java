package com.corejava.part1.app3;
class S 
{
	public static void main(String[] args) 
	{
		int i = 0;
		System.out.println(test1(i++)); //0
		System.out.println(test1(++i)); //2
		System.out.println(test2(i++)); //3
		System.out.println(test2(++i)); //5
	}
	static int test1(int i)
	{
		return i++;
	}
	static int test2(int i)
	{
		return ++i;
	}
}
