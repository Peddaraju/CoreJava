package com.lara;

import java.util.Calendar;
import java.util.Date;

public class S 
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getFirstDayOfWeek());
		System.out.println("------");
		cal.add(Calendar.MONTH, 24);
		Date date = cal.getTime();
		System.out.println(date);
	}
}
