package com.app;

import java.util.Arrays;

public class W
{
	public static void main(String[] args)
	{
		int[] x = {10, 20, 30, 40, 45, 25};
		int i = Arrays.binarySearch(x, 40);
		System.out.println(i);
	}
}
