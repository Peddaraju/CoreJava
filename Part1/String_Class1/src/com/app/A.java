package com.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A 
{
	public static void main(String[] args) 
	{
		String src = "abcababcababc";
		String exp = "a";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start()+":"+m1.group());
		}
	}
}
