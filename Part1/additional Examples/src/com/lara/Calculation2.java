package com.lara;
public class Calculation2 
{
	void sum(int a, int b)
	{
		System.out.println(a + b);
	}
	double sum(double a, double b)
	{
		System.out.println(a + b);
		return a + b;
	}
	public static void main(String[] args) 
	{
		Calculation2 obj = new Calculation2();
		obj.sum(20, 10);
		int result = obj.sum(20.25, 20.25);
	}
}
