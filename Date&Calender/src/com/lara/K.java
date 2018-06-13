package com.lara;

import java.util.Date;

public class K 
{
	public static void main(String[] args) 
	{
		Date date = new Date();
		long time = date.getTime();
		Date date1 = new Date(time-60*60*1000*24);
		System.out.println(date);
		System.out.println(date1);
	}
}
