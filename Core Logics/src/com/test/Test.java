package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) {
		
		int[] a = { 1, 2, 3, 4, 5, 8 };
		int[] b = { 2, 3, 1, 0, 5 };
		
		boolean isPresent = false;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				if (a[i] == b[j])
				{
					isPresent = true;
				}
			}
			if (!isPresent) 
			{
				System.out.println(a[i]+" is Not Present");
			} 
			else 
			{
				isPresent = false;
			}
		}
		
		
		
		
		
		
		
		
		
		
		/*Integer a[]={2,4,6,8,4,3,2,6};
		System.out.println(cheking(a));
		System.out.println(bruteforce(a));*/
		
	}

	private static char[] bruteforce(Integer[] a) {
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					continue;
				}
			}
		}
		return null;
	}

	private static boolean cheking(Integer[] str) {
		List list=(List) Arrays.asList(str);
		Set set=new HashSet(list);
		System.out.println(list);
		System.out.println(set);
		if(list.size()>set.size())
		{
			return true;
			
		}
		else
		return false;
	}

}
