package com.lara2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Manager2
{
	public static void main(String[] args)
	throws Exception
	{
		FileInputStream fin = 
			new FileInputStream("test.txt");
		ObjectInputStream in = 
			new ObjectInputStream(fin);
		A obj = (A) in.readObject();
		System.out.println(obj.i);
		System.out.println(obj.j);
	}
}
