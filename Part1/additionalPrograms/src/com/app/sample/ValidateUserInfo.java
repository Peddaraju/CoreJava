package com.app.sample;

public class ValidateUserInfo 
{
	public static boolean validateFirstName(String firstName)
	{
		return firstName.matches("[A-z][a-zA-z]*");
	}
	public static boolean validateLastName(String lastName)
	{
		return lastName.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
	}
	public static boolean validatePhone(String phone)
	{
		return phone.matches("[1-9]*");
	}
}
