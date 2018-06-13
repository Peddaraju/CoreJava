package com.lara;

import java.util.Date;

public class G 
{
	public static void main(String[] args) 
	{
		Date date = new Date(1000*60);
		long time = date.getTime();
		System.out.println(date);
		System.out.println(time);
	}
}
