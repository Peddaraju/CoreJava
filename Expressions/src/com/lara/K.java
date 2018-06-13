package com.lara;

import java.util.Scanner;

public class K 
{
	public static void main(String[] args) 
	{
		//swapping numbers through the formatters
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int i = Integer.parseInt(sc.next());
		System.out.println("enter second number");
		int j = Integer.parseInt(sc.next());
		System.out.println("before swapping");
		System.out.printf("i = %1$d , j = %2$d",i,j);
		System.out.println("");
		System.out.println("after swapping");
		System.out.printf("i = %2$d , j = %1$d",i,j);
	}
}
