package com.lara2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Manager1
{
	public static void main(String[] args)
	throws IOException
	{
		A a1 = new A();
		a1.i = 10;
		a1.j = 20.8;
		
		FileOutputStream fout = 
			new FileOutputStream("test.txt");
		ObjectOutputStream out = 
			new ObjectOutputStream(fout);
		out.writeObject(a1);
		System.out.println("done");
		
	}
}
