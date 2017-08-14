package com.app;

public class F 
{
	public static void main(String[] args) 
	{
		String s1 = "abc:123:xyz:hello:456";
		String x[] = s1.split(":");
		for(String s:x)
		{
			System.out.println(s);
		}
	}
}
