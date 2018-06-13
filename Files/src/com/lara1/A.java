package com.lara1;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class A
{
	public static void main(String[] args)
	throws Exception
	{
		FileWriter out = 
			new FileWriter("test.txt");
		BufferedWriter bout = 
			new BufferedWriter(out);
		bout.write("Hello to all");
		bout.newLine();
		bout.write("Hello to all");
		bout.newLine();
		bout.write("Hello to all");
		bout.flush();
		bout.close();
		out.close();
		System.out.println("done");
	}
}
