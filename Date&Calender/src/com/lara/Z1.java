package com.lara;

import java.text.NumberFormat;
import java.util.Locale;

public class Z1 
{
	public static void main(String[] args) 
	{
		double num = 129876.9090973563;
		System.out.println(num);
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		String s1 = nf.format(num);
		System.out.println(s1);
	}
}
