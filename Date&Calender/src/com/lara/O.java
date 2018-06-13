package com.lara;

import java.util.Calendar;
import java.util.Date;

public class O 
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		Date date = cal.getTime();
		System.out.println(date);
	}
}
