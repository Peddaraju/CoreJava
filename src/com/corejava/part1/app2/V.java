package com.corejava.part1.app2;
class V 
{
	public static void main(String[] args) 
	{
		System.out.println(1);//1
		test1();//2
		System.out.println(2);//6
	}
	static void test1()
	{
		System.out.println(3);//3
		test2();//4
	}
	static void test2()
	{
		System.out.println(4);//5
	}
}
