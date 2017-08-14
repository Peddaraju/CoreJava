package com.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S 
{
	public static void main(String[] args) 
	{
		String s = "abcxyzhelloabc";
		Pattern p = Pattern.compile(s.substring(0,3));
		Matcher m = p.matcher(s);
		while(m.find())
		{
			System.out.println(m.start()+":"+m.group());
		}
	}
}
