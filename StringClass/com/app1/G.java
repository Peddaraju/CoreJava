package com.app1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class G 
{
	public static void main(String[] args) 
	{
		String s = "AbcabcAbcABC";
		String s1 = "A";
		Pattern p = Pattern.compile(s1);
		Matcher m = p.matcher(s);
		while(m.find())
		{
			System.out.println(m.start()+":"+m.group());
		}
	}
}
