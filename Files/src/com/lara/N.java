package com.lara;

import java.io.File;
import java.io.IOException;

public class N
{
	public static void main(String[] args) throws Throwable 
	{
		File f1 = new File("a/b/c/d/e/f");
		File f2 = new File(f1 , "raj.doc");
		System.out.println(f2.createNewFile());
	}
}
