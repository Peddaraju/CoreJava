package com.lara;
public class Calculation3
{
	public static void main(int load) 
	{
		System.out.println(load);
		System.out.println("main method overloaded");
	}
	public static void main(String[] args) 
	{
		System.out.println("main() method invoked");
		main(10);
	}
}
