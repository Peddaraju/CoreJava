package com.lara3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Manager6
{
	public static void main(String[] args)
	throws IOException, ClassNotFoundException
	{
		Employee e1 = new Employee();
		System.out.println(e1);		
		File f1 = new File("emp.ext");
		FileInputStream fin = 
			new FileInputStream(f1);
		ObjectInputStream in = 
			new ObjectInputStream(fin);
		e1.readExternal(in);
		System.out.println(e1);	
	}
}
