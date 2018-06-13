package com.raj.EvenOrOdd;

import java.util.Scanner;

public class FindEvenOrOdd {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int a=sc.nextInt();
		if(a==0)
			System.out.println(a+" is neither odd or even");
		else if(a<0)
			System.out.println("Please Enter valid no");
		else if(a%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		
		/*else if(2*(a/2)==a)
			System.out.println("even");
		else
			System.out.println("odd");*/
	}

}
