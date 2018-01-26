package com.corejava.part1.app11;
class L 
{
	static	
	{
		System.out.println("L-SIB");
	}
	L()	
	{
		System.out.println("L()");
	}
	{
		System.out.println("L-IIB");
	}
}
class M 
{
	static	
	{
		System.out.println("M-SIB");
	}
	M()	
	{
		System.out.println("M()");
	}
	{
		System.out.println("M-IIB");
	}
	M(int i) 
	{
		L obj = new L();
		System.out.println("M(int)");
	}
	public static void main(String[] args) 	
	{
	    System.out.println("main begin");
	    M m1 = new M();
	    System.out.println("-----");
	    M m2 = new M(90);
	    System.out.println("-----");
	    System.out.println("main end");
	}
}

