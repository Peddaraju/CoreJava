package com.app;

public class I 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append("xyz");
		sb.append("123");
		System.out.println(sb);
		sb.append("ram");
		System.out.println("=======");
		System.out.println(sb);	
	}
}
