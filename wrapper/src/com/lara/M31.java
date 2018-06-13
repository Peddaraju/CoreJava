package com.lara;

public class M31 
{
	static void test(String ... i)
	{
		for(String str : i)
		{
			System.out.print(str + ",");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		test("msg1");
		test("msg1","msg2");
		test("msg1","msg2","msg3");
		test("msg1","msg2","msg3","msg4");
	}
}
