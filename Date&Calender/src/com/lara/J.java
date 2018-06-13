package com.lara;

import java.util.Date;

public class J 
{
	public static void main(String[] args) 
	{
		Date date = new Date();
		long time = date.getTime();
		Date date1 = new Date(time);
		System.out.println(date);
		System.out.println(date1);
	}
}
