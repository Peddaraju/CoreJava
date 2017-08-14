package com.app.sample;

public class StringCompare 
{
	public static void main(String[] args) 
	{
		String s1 = "Happy Birthday";
		String s2 = "happy birthday";
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		//test region case sensitive
		if(s1.regionMatches(0, s2, 0, 5))
			System.out.println("first 5 characters of s1 and s2 match");
		else
			System.out.println("first 5 characters of s1 and s2 do not match");
		//test strings ignorecase
		if(s1.regionMatches( true,0, s2, 0, 5))
			System.out.println("first 5 characters of s1 and s2 match");
		else
			System.out.println("first 5 characters of s1 and s2 do not match");
	}
}
