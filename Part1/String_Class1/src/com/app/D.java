package com.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D 
{
	public static void main(String[] args) 
	{
		String s1 = "abcabababc";
		Pattern p1 = Pattern.compile("[ab]");
		Matcher m = p1.matcher(s1);
		while(m.find())
		{
			System.out.println(m.start()+":"+m.group());
		}
	}
}
