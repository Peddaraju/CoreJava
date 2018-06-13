
package com.raj;

import java.util.Scanner;

public class R {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter somenthing");
		String s1=sc.next();
		try {
			System.out.println(1);
			int i=Integer.parseInt(s1);
			System.out.println(2);
			int k=i/(i-9);
			//System.out.println(k);
			System.out.println(3);
		} catch (NumberFormatException e) {
			System.out.println(4);
			//System.out.println(e);
			e.printStackTrace();
			System.out.println(5);
		}
			System.out.println(6);
	}

}
