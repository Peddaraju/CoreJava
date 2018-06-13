package com.raju.strings;

import java.util.Scanner;

public class StringPolindrom {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter string");
		String str=sc.next();
		StringBuffer sb=new StringBuffer();
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			sb.append(ch[i]);
		}
		sb.trimToSize();
		if(str.equals(sb)){
			System.out.println("polindrom");
		}
		else{
			System.out.println("not polindrom");
		}
	}

}
