package com.app1;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

class E implements Comparable
{
	int i;
	E(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return i+"";
	}
	public int hashCode()
	{
		return Integer.toString(i).hashCode();
	}
	public boolean equals(Object obj)
	{
		E e1 = (E) obj;
		return i == e1.i;
	}
	public int compareTo(Object obj) {
		E e = (E) obj;
		return (this.i < e.i)?-1:(this.i > e.i)?1:0;
	}
}
public class Manager19
{
	public static void main(String[] args)
	{
		SortedSet set = new TreeSet();
		set.add(new E(9));
		set.add(new E(9));
		set.add(new E(90));
		set.add(new E(90));
		set.add(new E(5));
		set.add(new E(5));
		System.out.println(set);

	}
}
