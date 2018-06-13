package com.comparator;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}
	
}



public class Test2{	

	public static void main(String[] args) {
		
		String s = "a1b2c3x1y2x3";
		System.out.println(s.length());
		System.out.println(s.indexOf('2'));
		System.out.println(s.indexOf('c'));
		System.out.println(s.indexOf('2', s.indexOf('2')+1));
		
		Path p = Paths.get("C:\\Hello\\AnotherFolder\\The File Name.PDF");
		String file = p.getFileName().toString();
		System.out.println(file.toString());
		
		String path = "C:/Hello/Another_Fol_der/The_File_Name.PDF";
		String name = path.substring(path.lastIndexOf("/")+1);
		String name2 = name.substring(0, 3);
		System.out.println(name2);
		
		
		
		String[] a={"raju","The"};
		for(int i=0;i<a.length;i++) {
			if(name2.equals(a[i])) {
				System.out.println("equal");
			}
			else{
				System.out.println("not");
			}
		}
		
		
		
		
		
		
		/*Set s = new TreeSet(new MyComparator());
		s.add(new StringBuffer("b"));
		s.add(new StringBuffer("n"));
		s.add(new StringBuffer("a"));
		System.out.println(s);*/
	}
}