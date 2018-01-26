package com.corejava.part1.app8;
class C 
{
	static int i;
	static	
	{
		i = 10;
		System.out.println("C-SIB");
	}
	static void test() 
	{
		System.out.println("C-test");
	}
}
/*class D
{
	static	
	{
		System.out.println("D-SIB");
	}
	public static void main(String[] args) 	
	{
		System.out.println(1);
		C.test();
		System.out.println(2);
		System.out.println(C.i);
	}
}
*/