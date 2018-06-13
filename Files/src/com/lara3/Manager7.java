package com.lara3;

import java.io.Console;

public class Manager7
{
	public static void main(String[] args)
	{
		System.out.println(1);
		Console c1 = System.console();
		System.out.println(c1);
		System.out.println(2);
		c1.readPassword();
	}
}
