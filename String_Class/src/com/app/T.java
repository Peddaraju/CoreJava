package com.app;

public class T 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		sb.append("hello");
		System.out.println(sb);
		System.out.println("--------");
		System.out.println(sb.delete(0, 3));
		System.out.println("---------");
		System.out.println(sb.deleteCharAt(4));
	}
}
