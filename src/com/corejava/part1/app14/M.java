package com.corejava.part1.app14;
class K 
{
	static	
	{
		System.out.println("K-SIB");
	}
	static void test() 
	{
		System.out.println("K-test");
	}
}
class L extends K  
{
	
	static	
	{
		System.out.println("L-SIB");
	}
}
class M  
{
	public static void main(String[] args) 	
	{
		System.out.println("--11---");
		
		L.test();//K.test();
		L l = new L();
		System.out.println("--22---");
	}
}
