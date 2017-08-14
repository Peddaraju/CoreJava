package com.app;

import java.util.StringTokenizer;

public class U 
{
	public static void main(String[] args) 
	{
		StringTokenizer st = new StringTokenizer("a;b;c;d;123;abc",";");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextElement());
		}
	}
}
