package com.app1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L 
{
	public static void main(String[] args) 
	{
		String s = "abcxyz1pqr2km9rst";
		Pattern p = Pattern.compile("[a-ep-z1-35-9]");
		Matcher m = p.matcher(s);
		while(m.find())
		{
			System.out.println(m.start()+":"+m.group());
		}
	}
}
