package com.lara;

import java.util.Calendar;
import java.util.Date;

public class R 
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.roll(Calendar.DATE, 35);
		Date date = cal.getTime();
		System.out.println(date);
	}
}
