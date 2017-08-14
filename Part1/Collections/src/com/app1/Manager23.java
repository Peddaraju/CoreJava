package com.app1;

import java.util.HashSet;
import java.util.Iterator;

public class Manager23
{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args)
	{
		HashSet<Comparable> set = new HashSet<Comparable>();
		set.add(123);
		set.add("abc");
		set.add("xyz");
		set.add(123);
		set.add(true);
		set.add('a');
		System.out.println(set);
		Iterator<Comparable> it = 
			set.iterator();
		System.out.println("---");
		while(it.hasNext())
		{
			System.out.print(it.next() + ",");
		}
	}
}
