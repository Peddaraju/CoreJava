package com.lara;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class T 
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		System.out.println(date);
		System.out.println("----------");
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		String s = df.format(date);
		System.out.println(s);
	}
}
