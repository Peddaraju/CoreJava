package com.lara;

import java.text.NumberFormat;

public class Z4 
{
	public static void main(String[] args) 
	{
		double num = 129876.9090973563;
		System.out.println(num);
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String s1 = nf.format(num);
		System.out.println(s1);	
	}
}
