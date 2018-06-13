package com.lara;

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr number between 0 to 15");
		int num = sc.nextInt();
		assert( num >= 0 && num <=15):"bad number:"+num;
		System.out.println("u entered :" + num);
	}
}