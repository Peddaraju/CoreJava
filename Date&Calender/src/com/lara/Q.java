package com.lara;

import java.util.Calendar;
import java.util.Date;

public class Q 
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, 1);
		Date date = cal.getTime();
		System.out.println(date);
	}
}
