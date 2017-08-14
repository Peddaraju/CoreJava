package com.app;

import java.util.ArrayList;

public class Manager8
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list1 = 
			new ArrayList<Integer>();
		list1.add(90);
		list1.add(0);
		list1.add(9);
		list1.add(4);
		System.out.println(list1);
		ArrayList<Comparable> list2 = 
			new ArrayList<Comparable>(list1);
		list2.add("abc");
		System.out.println(list2);
	}
}
