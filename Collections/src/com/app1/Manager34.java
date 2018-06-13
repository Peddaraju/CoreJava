package com.app1;

import java.util.HashMap;

public class Manager34
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		map.put(null, null);
		map.put(null, "abc");
		map.put(null, null);
		map.put(null, "xyz");
		System.out.println(map);
	}
}
