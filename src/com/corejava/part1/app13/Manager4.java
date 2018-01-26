package com.corejava.part1.app13;
class I  
{
	I(double j)  
	{
	   System.out.println("I(double)");
	}
}
class J extends I  
{
	J()  
	{
		super(9.9);
		System.out.println("J()");
	}
	J(double d)  
	{
	    super(d);
	    System.out.println("J(double)");
	}
}
class Manager4  
{
	public static void main(String[] args) 	
	{
		I i1 = new I(9.9);
		System.out.println("-----");
	    J j1 = new J();
		System.out.println("-----");
		J j2 = new J(3.4);
	}
}
