package com.lara;

public class M17 
{
	public static void main(String[] args) 
	{
		Integer i1 = 4678;
		Integer i2 = 4678;
		if(i1 == i2)
		{
			System.out.println("same objects");
		}
		else
		{
			System.out.println("different objects");
		}
		if(i1.equals(i2))
		{
			System.out.println("meaningfully equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}
}
