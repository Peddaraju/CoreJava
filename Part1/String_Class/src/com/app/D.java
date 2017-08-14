package com.app;



public class D 
{
	public static void main(String[] args) 
	{
		String s1 = "abc123xyz123xyz";
		System.out.println(s1.codePointAt(0));
		System.out.println("------");
		System.out.println(s1.codePointAt(6));
		System.out.println("--------");
		System.out.println(s1.codePointBefore(2));
		System.out.println("----------");
		System.out.println(s1.codePointCount(2, 9));
		System.out.println("-------------");
		System.out.println(s1.contains("ab"));
		System.out.println("---------------");
		System.out.println(s1.contains("prince"));
		System.out.println("----------------");
		System.out.println(s1.replace('x', 'r'));
		System.out.println("--------------------");
		System.out.println(s1.startsWith("abc"));
		System.out.println("done");
		
	}

}
