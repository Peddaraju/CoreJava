package com.app;

public class U 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("xyz");
		StringBuilder sb1 = new StringBuilder();
		sb1.append("xyz");
		System.out.println(sb.equals(sb1));
		System.out.println("done");
	}
}
