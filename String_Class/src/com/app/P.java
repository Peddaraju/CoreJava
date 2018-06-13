package com.app;

public class P 
{
	public static void main(String[] args) 
	{
		String s1 = " abc xyz ";
		s1.trim();
		System.out.println(s1.length());
		s1 = s1.trim();
		System.out.println(s1.length());
		System.out.println("===============");
		StringBuffer sb = new StringBuffer();
		sb.append(" abc xyz ");
		System.out.println("before trim to size method");
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println("=========");
		System.out.println("after trim to size method");
		System.out.println(sb.capacity());
	}
}
