package com.app;

public class N 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append("xyz");
		System.out.println("normal string");
		System.out.println(sb);
		System.out.println("===============");
		System.out.println("reverse string");
		sb.reverse();
		System.out.println(sb);
		System.out.println("done");	
	}
}
