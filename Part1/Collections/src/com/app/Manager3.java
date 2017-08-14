package com.app;

import java.util.ArrayList;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

public class Manager3
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add("abc");
		list.add(90.9);
		list.add(true);
		list.add(null);
		System.out.println(list.size());
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}
}
