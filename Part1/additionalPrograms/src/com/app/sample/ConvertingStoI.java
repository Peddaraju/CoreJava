package com.app.sample;

import java.util.Scanner;

public class ConvertingStoI 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter integer number");
		String yourString = sc.next();
		int yourInt = Integer.parseInt(yourString);
		System.out.println(yourInt);
	}	
}
