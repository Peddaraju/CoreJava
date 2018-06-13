package com.raj;

import java.util.Scanner;

public class PrimeNos {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int n=sc.nextInt();
		if(n!=0 && n!=1){
			for(int i=2;i<=n;i++)
			{
				int count=0;
				for(int j=2;j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==1){
					System.out.print(i);
				}
			}
		}
		else{
			System.out.println("enter no except 0 & 1");
			n=sc.nextInt();
		}
	}

}
