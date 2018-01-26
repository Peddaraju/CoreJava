package com.corejava.part1.app8;
class I 
{
	static void test() 
	{
	     System.out.println("from test");
	}
	static	
	{
		System.out.println("I-SIB");
	}
}
class J	
{
	public static void main(String[] args) 	
	{
	    System.out.println("---111---");
	    I.test();
	    System.out.println("---222---");
	    I.test();
	    System.out.println("---333---");
	    I.test();
	    System.out.println("---444---");
	}
	static	
	{
		System.out.println("J-SIB");
	}
}
