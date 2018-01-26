package com.corejava.part1.app4;
class X	
{
	static int i;
	public static void main(String[] args) 	
	{
		int i = 10;
		System.out.println(i);
		System.out.println(X.i);
        i = 20;
		X.i = 30;
		System.out.println(X.i);
		System.out.println(i);
	}
}
