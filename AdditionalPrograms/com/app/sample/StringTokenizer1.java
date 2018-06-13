package com.app.sample;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence and press the enter");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer( s );
		System.out.printf("number of elements :%d\n the tokens are:\n",st.countTokens());	
		while( st.hasMoreElements() )
		{
			System.out.println( st.nextToken());
		}
	}
}
