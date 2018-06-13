package com.raju.strings;

public class StringRev {
	public static void main(String[] args) {
		String str="raju";
		
		StringBuilder sb=new StringBuilder();
		char[] ch=str.toCharArray();
		for (int i=ch.length-1;i>=0;i--) {
			sb.append(ch[i]);
		}
		//System.out.println(sb);
		StringBuffer sb1=new StringBuffer("raju");
		StringBuffer sb2=new StringBuffer();
		sb2.append(sb1);
		sb2.reverse();
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println(sb1.equals(sb2));
	}

}
