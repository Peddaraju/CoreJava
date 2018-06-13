package com.app1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class F 
{
	public static void main(String[] args) 
	{
		String s1 = "abc";
		String s2 = "abc";
		Pattern p = Pattern.compile(s2);
		Matcher m = p.matcher(s1);
		while(m.find())
		{
			System.out.println("both the strings are equal");
		}
		
	}
}
