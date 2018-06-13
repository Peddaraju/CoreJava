package com.app1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class K 
{
	public static void main(String[] args) 
	{
		String s = "12345abcdef234cdefgh";
		Pattern p = Pattern.compile("[a-b0-3]");
		Matcher m = p.matcher(s);
		while(m.find())
		{
			System.out.println(m.start()+":"+m.group());
		}
	}
}
