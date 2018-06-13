package com.test;

import java.util.*;
public class Test2
{
  @SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String args[])
  {
    HashMap hm1 = new HashMap();
    hm1.put("one", 1);
    hm1.put("thousand", 1000);
    hm1.put("null", 10);
    hm1.put("hundred", 100);
		              // SORTING KEYS
    Set mySet = hm1.keySet();
    System.out.println("\nhm1 keys: " + mySet);
    TreeSet ts1 = new TreeSet(mySet);
    System.out.println("hm1 sorted keys: " + ts1);
 
		              // SORTING VALUES
    Collection myCol = hm1.values();
    System.out.println("\nhm1 values: " + myCol);  	
    TreeSet ts2 = new TreeSet(myCol);
    System.out.println("hm1 sorted values: " + ts2);
 
		              // GET KEY FROM VALUE
    for(Object obj1 : mySet)
    {
      if(hm1.get(obj1).equals(10))
      {
        System.out.println("10 value key is " + obj1);   
      }
    }
  }
}

