package com.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class H 
{
	public static void main(String[] args) 
	{
		String s = "a1b2c3a1b2c3";
		Pattern p = Pattern.compile("[1234]");
		Matcher m = p.matcher(s);
		while(m.find())
		{
			System.out.println(m.start()+":"+m.group());
		}
	}
}
