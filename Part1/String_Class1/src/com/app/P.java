package com.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P 
{
	public static void main(String[] args) 
	{
		String s = "a1b2c3h4z9";
		Pattern p = Pattern.compile("\\w+");
		Matcher m = p.matcher(s);
		while(m.find())
		{
			System.out.println(m.start()+":"+m.group());
		}	
	}
}
