package com.app1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R 
{
	public static void main(String[] args) 
	{
		String s = " a1 b2 c3 h4 z9 ";
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher(s);
		while(m.find())
		{
			System.out.println(m.start()+":"+m.group());
		}
	}
}
