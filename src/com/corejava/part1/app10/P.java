package com.corejava.part1.app10;
class P 
{
	P() 
	{
		System.out.println("P()");
	}
	P(int i)	
	{
		this();
		System.out.println("P(int)");
	}
	P(char c1) 
	{
	   this();
	   System.out.println("P(char)");
	}
	P(boolean b1)	
	{
	   this('a');
	   System.out.println("P(boolean)");
	}
	P(double d)  
	{
	   this(10);
	   System.out.println("P(double)");
	}
	public static void main(String[] args) 	
	{
		P p1 = new P();
		System.out.println("-----");
		P p2 = new P('a');
		System.out.println("-----"); 
		P p3 = new P(10);
		System.out.println("-----");
		P p4 = new P(10.9);
		System.out.println("-----");
		P p5 = new P(false);
		System.out.println("-----");

	}

}
