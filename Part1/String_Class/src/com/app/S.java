package com.app;

public class S 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		sb.append("xyz");
		System.out.println(sb.toString());
		System.out.println("===========");
		StringBuilder sb1 = new StringBuilder("abcxyz");
		System.out.println(sb.toString());
		System.out.println("===========");
		System.out.println(sb == sb1);
		System.out.println("===========");
		System.out.println(sb.equals(sb1));
		System.out.println("============");
		System.out.println(sb.hashCode());
		System.out.println(sb1.hashCode());	
	}
}
