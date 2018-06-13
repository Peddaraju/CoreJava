package com.app;

public class J 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("abc");
		sb1.append("xyz");
		sb1.append("\n");
		sb1.append("hello\t");
		sb1.append("test");
		System.out.println(sb1);
	}
}
