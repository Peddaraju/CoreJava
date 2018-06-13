package com.lara;

import java.util.Date;

public class I
{
	public static void main(String[] args) 
	{
		Date date = new Date();
		long time = date.getTime();
		System.out.println(date);
		System.out.println(time);
	}
}