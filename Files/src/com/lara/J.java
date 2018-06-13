package com.lara;

import java.io.File;
import java.io.IOException;

public class J
{
	public static void main(String[] args)
	{
		File f1 = new File("abc");
		System.out.println(f1.mkdir());
		File f2 = new File(f1, "hello.txt");
		try
		{
			System.out.println(f2.createNewFile());
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		System.out.println("done");
	}
}
