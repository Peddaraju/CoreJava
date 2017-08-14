package com.app1;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Manager24
{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args)
	{
		/*HashSet set = 
			new HashSet();
		set.add(90);
		set.add(0);
		set.add(9);
		set.add(19);
		set.add(6);
		set.add(18);
		System.out.println(set);
		TreeSet set1 = 
			new TreeSet(set);
		System.out.println(set1);
		*/
		NavigableMap map = new TreeMap();
		map.put("A",  "value");
		map.put("B",  "value");
		map.put("C",  "value");
		map.put("D",  "value");
		System.out.println(map.ceilingKey("A"));
		
	}
}
