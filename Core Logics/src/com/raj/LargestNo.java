package com.raj;

import java.util.Scanner;

public class LargestNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int n=sc.nextInt(); 
		int l=n;
		int count = 1;
		while (count<10)
		{
			if(n>l)
			{
				l=n;
			}
		
				n=sc.nextInt();
				count++;
		}
		System.out.println("large no="+l);
	}

}
