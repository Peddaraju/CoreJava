package com.raj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B {
	public static void main(String[] args) {
		List al=new ArrayList();
		al.add(40);
		al.add(20);
		al.add(50);
		al.add(10);
		al.add(30);
		
		for (Iterator iterator = al.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
			
		}
	}

}
