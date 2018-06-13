package com.lara;
public class M26 
{
	/*
	static void test(byte b)
	{
		System.out.println("byte");
	}
	*/
	/*
	static void test(short b)
	{
		System.out.println("short");
	}
	*/
	/*
	static void test(int b)
	{
		System.out.println("int");
	}
	static void test(long b)
	{
		System.out.println("long");
	}
	
	static void test(float b)
	{
		System.out.println("float");
	}
	static void test(double b)
	{
		System.out.println("double");
	}
	*/
	/*
	static void test(Byte b)
	{
		System.out.println("Byte");
	}
	*/
	static void test(Short b)
	{
		System.out.println("Short");
	}
	static void test(Integer b)
	{
		System.out.println("Integer");
	}
	static void test(Double b)
	{
		System.out.println("Double");
	}
	static void test(Float b)
	{
		System.out.println("float");
	}
	/*
	static void test(Number b)
	{
		System.out.println("number");
	}
	*/
	/*
	static void test(Object b)
	{
		System.out.println("object");
	}
	*/
	static void test(byte ... b)
	{
		System.out.println("var args");
	}
	public static void main(String[] args) 
	{
		byte b = 10;
		test(b);
	}
}
