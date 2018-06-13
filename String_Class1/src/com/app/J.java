package com.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J 
{
	public static void main(String[] args) 
	{
		String s = "abcxyz1pqr2km9rtz";
		Pattern p = Pattern.compile("[a-p]");
		Matcher m = p.matcher(s);
		while(m.find())
		{
			System.out.println(m.start()+":"+m.group());
		}
	}
}
