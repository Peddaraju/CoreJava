package com.corejava.part1.app13;
class K  
{
	K()  
	{
		System.out.println("K()");
	}

    {
		System.out.println("K-IIB");
	}
}
class L extends K  
{
	L()  
	{
		super();
		System.out.println("L()");
	}

    {
		System.out.println("L-IIB");
	}
}
class Manager5  
{
	public static void main(String[] args) 	
	{
		K k1 = new K();
		System.out.println("-----");
        L l1 = new L();
		System.out.println("-----");
	}
}
