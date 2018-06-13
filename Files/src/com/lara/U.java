package com.lara;

import java.io.FileWriter;
import java.io.IOException;

public class U
{
	public static void main(String[] args)
	{
		FileWriter out = null;
		try
		{
			out = new FileWriter("test.txt");
			out.write("hello123\njava and");
			System.out.println("done");
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(out != null)
				{
					out.flush();
					out.close();
					out = null;
				}
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
		
	}
}
