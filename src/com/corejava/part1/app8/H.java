package com.corejava.part1.app8;
class G 	
{
	static	
	{
		System.out.println("G-SIB");
	}
	public static void main(String[] args) 	
	{
	    System.out.println("G-main");
	}
}
class H	
{
	static	
	{
		System.out.println("H-SIB");
	}
	public static void main(String[] args) 	
	{
	    System.out.println("H-main-begin");
	    G.main(args);
	    System.out.println("H-main-end");
	}
}
