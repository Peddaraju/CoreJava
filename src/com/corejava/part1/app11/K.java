package com.corejava.part1.app11;
class J  
{
	{
		System.out.println("J-IIB1");
	}

	J()  
	{
		System.out.println("J()");
	}

	{
		System.out.println("J-IIB2");
	}
}
class K  
{
	{
		System.out.println("K-IIB1");
	}

	K() 
	{
		System.out.println("K()");
	}

	{
		System.out.println("K-IIB2");
	}

	K(int i)	
	{
		System.out.println("K(int)");
	}

	static	
	{
		System.out.println("K-SIB");
	}

	public static void main(String[] args) 	
	{
		System.out.println("main begin");
		K k1 = new K();
		System.out.println("-----");
		J j1 = new J();
		System.out.println("-----");
		K k2 = new K(20);
		System.out.println("main end");
	}
}
