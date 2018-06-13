package com.app.sample;

import java.util.Scanner;

public class StaticCharacterConversion 
{
	public static void main(String[] args) 
	{
		/*based on radix it will convert into different formats
		 *for example if we enter 16 it will consider like a hexaDecimal conversion
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a radix");
		int radix = sc.nextInt();
		System.out.printf("please choose one:\n1---%s\n2---%s\n","converting digit to character","converting character to digit");
		int ch = sc.nextInt();
		switch( ch )
		{
		 case 1: System.out.println("enter a digit");
		    	 int digit = sc.nextInt();
		    	 System.out.printf("converting digit to character:%s\n",Character.forDigit(digit, radix));
		    	 break;
		 case 2: System.out.println("enter a character");
		 		 char c1 = sc.next().charAt(0);
		 		 System.out.printf("converting character to digit:%s\n",Character.digit(c1, radix));
		 		 break;
		}
	}
}
