package com.corejava.part1.app8;
class K 
{
	static int i = 10;	
	static	
	{
		System.out.println("K-SIB");
	}
	static void test()	
	{
		System.out.println("K-test");
	}
}
class L 
{
	static	
	{
		System.out.println("L-SIB");
	}
	public static void main(String[] args)	
	{
	    System.out.println("---aaa---");
	    K.test();
	    System.out.println("---bbb---");
	    K.test();
	    System.out.println("---ccc---");
	    System.out.println(K.i);
	    System.out.println("---ddd---");
	}
}
