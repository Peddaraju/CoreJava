package com.lara;

import java.text.NumberFormat;

public class Z 
{
	public static void main(String[] args) 
	{
		double num = 129876.9090973563;
		System.out.println(num);
		NumberFormat nf = NumberFormat.getInstance();
		String s1 = nf.format(num);
		System.out.println(s1);
	}
}
