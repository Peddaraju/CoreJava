package com.corejava.part1.app12;
class K  
{
	K()  
	{
		super();
		System.out.println("K()");
	}
}
class L extends K  
{
	L()  
	{
		//super();
		System.out.println("L()");
	}
}
class Manager1  
{
	public static void main(String[] args) 	
	{
		K k1 = new K();
		System.out.println("-----");
        L l1 = new L();
		System.out.println("-----");
		K l2 = new L();
		System.out.println("-----");
		
	}
}
