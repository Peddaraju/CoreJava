package com.lara;
public class M27 
{
	/*
	static void test(Byte b, Byte i)
	{
		System.out.println("Byte");
	}
	*/
	static void test(byte ... b)
	{
		System.out.println("byte");
	}
	public static void main(String[] args)
	{
	    byte b = 10;
	    test(b, b);
	}
}
