package com.corejava.part1.app13;
class O  
{
	{
		System.out.println("O-IIB");
	}
    O()  
	{
		System.out.println("O()");
	}
}
class P extends O  
{
	P()  
	{
		System.out.println("P()");
	}

    {
		System.out.println("P-IIB");
	}

    P(int i)	
	{
		this();
		System.out.println("P(int)");
	}
}
class Manager7 
{
	public static void main(String[] args) 	
	{
		O o1 = new O();
		System.out.println("------");
        P p1 = new P();
		System.out.println("------");
        P p2 = new P(20);
		System.out.println("------");
	}
}
