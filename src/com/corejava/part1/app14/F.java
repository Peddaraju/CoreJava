package com.corejava.part1.app14;
class F 
{
	static 	
	{
		System.out.println("F-SIB");
	}
	public static void main(String[] args) 	
	{
	    System.out.println("F-main");
	}
}
class G extends F 
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
class H extends G  
{
	static 	
	{
		System.out.println("H-SIB");
	}
}
class I  
{
	static	
	{
		System.out.println("I-SIB");
	}
	public static void main(String[] args) 	
	{
		System.out.println("I-main-begin");
		G.main(args);
		System.out.println("I-main-end");
	}
}
class J  
{
	static	
	{
		System.out.println("J-SIB");
	}
	public static void main(String[] args) 	
	{
	    System.out.println("J-main-begin");
	    H.main(args);//G.main(args);
	    System.out.println("J-main-end");
	}
}
