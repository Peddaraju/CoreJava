package com.app1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class I 
{
	public static void main(String[] args) 
	{
		//count the number of spaces present in string 
		
		String s = " abc 123 sd abcd 123 rty ";
		Pattern p = Pattern.compile("[ ]");
		Matcher m = p.matcher(s);
		int i=0;
		while(m.find())
		{
			i++;
			System.out.println(i);
		}
	}
}
