package com.raj;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int n=sc.nextInt();
		long fact=1;
		
		//Using For Looop
		/*for(int i=2;i<=n;i++)
		{
				fact=fact*i;
		}
		System.out.println(fact);*/
		
		//Using While Loop
		/*while(n>=1)
		{
			fact=fact*n--;
		}
		System.out.println(fact);*/
		
		//using recursion
		System.out.println(fact(n));
	}

	private static int fact(int n) 
	{
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}

}
