package com.app;
import java.util.ArrayList;
public class Manager10
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = 
			new ArrayList<Integer>();
		list.add(9);
		list.add(0);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(null);
		System.out.println(list);
		boolean flag = 
			list.remove(null);
		System.out.println(list);
		System.out.println(flag);
		flag = 
			list.remove(new Integer(12));
		System.out.println(flag);		
	}
}
