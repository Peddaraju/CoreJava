package com.app5;

import java.util.HashMap;

public class ThreadLocal 
{
	private HashMap map = 
		new HashMap();
	public void set(Object obj)
	{
		Thread t = Thread.currentThread();
		long id = t.getId();
		map.put(id, obj);
	}
	public Object get(Object obj)
	{
		Thread t = Thread.currentThread();
		long id = t.getId();
		return map.get(id);
	}
}
