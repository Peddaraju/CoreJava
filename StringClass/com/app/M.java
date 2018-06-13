package com.app;

public class M 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer();
		sb1.append("abc");
		sb1.append("xyz");
		StringBuffer sb2 = new StringBuffer();
		sb2.append("abc");
		sb2.append("xyz");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println("done");
	}
}
