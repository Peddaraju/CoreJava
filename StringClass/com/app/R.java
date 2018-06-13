package com.app;

public class R 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new  StringBuffer();
		sb.append("abc");
		sb.append("xyz");
		sb.append("hello");
		System.out.println(sb.toString());
		System.out.println("------------");
		System.out.println(sb.substring(3));
		System.out.println("--------------");
		System.out.println(sb.subSequence(1, 3));
	}
}
