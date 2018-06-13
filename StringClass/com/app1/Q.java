package com.app1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q 
{
	public static void main(String[] args) 
	{
		String s = "a1b2c3h4z9";
		Pattern p = Pattern.compile("\\D");
		Matcher m = p.matcher(s);
		while(m.find())
		{
			System.out.println(m.start()+":"+m.group());
		}
	}
}
