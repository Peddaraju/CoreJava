package com.app;

public class O 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("abcxyzhello");
		System.out.println(sb);
		System.out.println("============");
		sb.delete(3, 6);
		System.out.println(sb);
		System.out.println("=============");
		sb.deleteCharAt(1);
		System.out.println(sb);
	}
}
