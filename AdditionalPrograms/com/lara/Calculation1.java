package com.lara;
public class Calculation1 
{
	void sum(int a, int b)
	{
		System.out.println(a + b);
	}
	void sum(double a, double b)
	{
		System.out.println(a + b);
	}
	public static void main(String[] args) 
	{
		Calculation1 obj = new Calculation1();
		obj.sum(20, 10);
		obj.sum(20.25, 20.25);
	}
}
