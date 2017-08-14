package com.app;

import java.util.ArrayList;
import java.util.Collections;

class D implements Comparable
{
	int i;
	D(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i = " + i;
	}
	public int compareTo(Object obj)
	{
		if( !(obj instanceof D)) {
			throw new ClassCastException("invalid object");
		}
		else if ( obj.equals(null)){
			throw new NullPointerException("null Object invalid");
		}
		else {
			return (i < ((D)obj).i)?-1:(i > ((D)obj).i)?1:0;
		}
	}
}
public class Manager24
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(new D(9));
		list.add(new D(0));
		list.add(new D(8));
		list.add(new D(2));
		list.add(new D(5));
		list.add("A");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}


