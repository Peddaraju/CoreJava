package com.app;

import java.util.Arrays;

public class V
{
	public static void main(String[] args)
	{
		String x[] = {
						"abc",
						"aBc",
						"ABc",
						"123",
						"ABC",
						"Abc",
						"9899",
						"009999"
					 };
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		
	}
}




