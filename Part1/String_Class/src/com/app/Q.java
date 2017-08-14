package com.app;

public class Q 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("abababcabcab");
		sb.append("abcabcabc");
		System.out.println(sb.capacity());
		System.out.println("=========");
		sb.trimToSize();
		System.out.println(sb.length());	
	}
}
