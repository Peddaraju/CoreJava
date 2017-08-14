package com.app.sample;

import java.util.Scanner;

public class Validate 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter first name");
		String firstName = sc.nextLine();
		System.out.println("please enter last Name");
		String lastName = sc.nextLine();
		System.out.println("please enter phone number");
		String phone = sc.nextLine();
		
		System.out.println("Validate result");
		if( !ValidateUserInfo.validateFirstName( firstName ) )
		System.out.println("invalid firstname");
		else if( !ValidateUserInfo.validateLastName( lastName ) )
			System.out.println("invalid lastname");
		else if(!ValidateUserInfo.validatePhone(phone))
			System.out.println("invalid phone number");
		else
			System.out.println("valid input: thank you");
		
	}

}
