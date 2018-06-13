package com.lara;

import java.io.File;

public class L
{
	public static void main(String[] args)
	{
		File f1 = new File("abc2");
		File f2 = new File(f1, "abc2");
		System.out.println(f2.mkdir());
	}
}
