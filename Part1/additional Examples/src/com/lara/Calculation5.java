package com.lara;
public class Calculation5 
{
	void sum(int a, long b)
	{
		System.out.println("a method invoked");
	}
	void sum(long a, int b)
	{
		System.out.println("b method invoked");
	}
	public static void main(String[] args)
	{
		Calculation5 obj = new Calculation5();
		obj.sum(10, 20);
	}
}
