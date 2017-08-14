package com.app.sample;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String s1 = "HCL technology";
		char c[] = new char[5];
		System.out.printf("given string : %s",s1);
		System.out.printf("\nlength of string: %d",s1.length());
		System.out.print("\n the reversed string is: ");
		for( int count = s1.length()-1; count >= 0; count--)
		{
			System.out.printf("%s",s1.charAt(count));
		}	
	}
}
