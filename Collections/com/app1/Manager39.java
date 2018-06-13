package com.app1;

import java.util.HashMap;

class P
{
	int i;
	P(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return i + "";
	}
}

class Q
{
	int i;
	Q(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return  i + "";
	}
	public int hashCode()
	{
		return Integer.toString(i).hashCode();
	}
	public boolean equals(Object obj)
	{
		return (obj instanceof Q && i == ((Q)obj).i);
	}
}
public class Manager39
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		
		map.put(90, "e1");
		map.put(90, "e2");
		
		map.put("abc", "v1");
		map.put("abc", "v2");
		
		map.put(new P(9), "hello1");
		map.put(new P(9), "hello2");
		
		map.put(new Q(8), "hello3");
		map.put(new Q(8), "hello4");
		
		map.put(new StringBuffer("abc"), "hello4");
		map.put(new StringBuffer("abc"), "hello5");
		
		System.out.println(map);
	}
}
