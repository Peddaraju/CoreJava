package com.corejava.part1.app4;
class H 	
{
	static int i;

	public static void main(String[] args) 	
	{
		System.out.println(i);
		System.out.println(H.i);
		i = 10;
		System.out.println(i);
		System.out.println(H.i);
		H.i = 20;
		System.out.println(i);
		System.out.println(H.i);
	}
}
