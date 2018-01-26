package com.corejava.part1.app10;
class N 
{
	N()  
	{
		this(10);
		System.out.println("N()");
	}
	N(int i)	
	{
		System.out.println("N(int)");
	}
	public static void main(String[] args) 	
	{
		N n1 = new N();
		System.out.println("-----");
		N n2 = new N(20);
		System.out.println("-----");
	}

}
