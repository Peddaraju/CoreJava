package com.raj;

import java.util.Scanner;

public class Stars1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int n=sc.nextInt();
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
