package com.lara;

import java.util.Date;

public class H 
{
	public static void main(String[] args) 
	{
		Date date = new Date(1000*60*6);
		long time = date.getTime();
		System.out.println(date);
		System.out.println(time);
	}
}
