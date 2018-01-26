package com.corejava.part1.app11;
class G 
{
	{
		System.out.println("G-IIB");
	}

	G(int i)	
	{
		System.out.println("G(int)");
	}

	{
		System.out.println("G-IIB2");
	}

	G()  
	{
		this(10);
		System.out.println("G()");
	}
	public static void main(String[] args) 	
	{
		G g1 = new G();
		System.out.println("----");
		G g2 = new G(20);
		System.out.println("----");
	}

}
