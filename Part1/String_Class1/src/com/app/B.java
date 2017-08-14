package com.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B 
{
	public static void main(String[] args) 
	{
		String src = "abcababcababc";
		String exp = "abc";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start()+":"+m1.group());
		}
		
	}

}
