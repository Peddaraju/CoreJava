package com.raj;

import java.util.Scanner;

public class Stars2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int n=sc.nextInt();
		for(int r=1;r<=n;r++)
		{
			for(int c=n;c>=n-r+1;c--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
