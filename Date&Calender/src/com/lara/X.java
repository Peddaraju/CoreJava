package com.lara;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class X 
{
	public static void main(String[] args) 
	{
		Date date = new Date();
		System.out.println(date);
		System.out.println("-----------");
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, new Locale("it"));
		String s1 = df.format(date);
		System.out.println(s1);
	}
}
