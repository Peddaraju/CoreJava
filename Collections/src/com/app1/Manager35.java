package com.app1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Manager35
{	
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		map.put("abc", "v1");
		map.put("key", "v2");
		map.put("key1", "v21");
		map.put("key2", "v22");
		map.put("key3", "v23");
		map.put("key4", "v24");
		Set set = map.keySet();
		Iterator it = set.iterator();
		Object key, value;
		while(it.hasNext())
		{
			key = it.next();
			value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}
}
