package com.lara;

import java.io.File;

public class H
{
	public static void main(String[] args)
	{
		File f1 = new File("F:/hello");
		System.out.println(f1.exists());
		System.out.println(f1.mkdir());
		System.out.println(f1.exists());
	}
}
