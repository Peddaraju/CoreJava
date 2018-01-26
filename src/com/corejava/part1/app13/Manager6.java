package com.corejava.part1.app13;
class M 
{
	M()  
	{
		System.out.println("M()");
	}

    {
		System.out.println("M-IIB1");
	}

    {
		System.out.println("M-IIB2");
	}
}
class N extends M  
{
	{
		System.out.println("N-IIB1");
	}

    N()  
	{
		System.out.println("N()");
	}

    {
		System.out.println("N-IIB2");
	}
}
class Manager6 
{
	public static void main(String[] args) 	
	{
		M m1 = new M();
        System.out.println("------");
		N n1 = new N();
	}
}
