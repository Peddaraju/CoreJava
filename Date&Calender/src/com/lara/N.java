package com.lara;

import java.util.Calendar;
import java.util.Date;

public class N 
{
	public static void main(String[] args) 
	{
		Calendar calsi = Calendar.getInstance();
		calsi.add(Calendar.DATE, 1);
		Date date = calsi.getTime();
		System.out.println(date);
	}
}
