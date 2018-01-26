package com.corejava.part1.app12;
class P 
{
	P()  
	{
		System.out.println("P()");
	}
}
class Q extends P  
{
	Q()  
	{
		System.out.println("Q()");
	}
}
class R extends Q  
{
	R()  
	{
		System.out.println("R()");
	}
}
class S extends R  
{
	S()  
	{
		System.out.println("S()");
	}
}
class T extends S 
{
	T()  
	{
		System.out.println("T()");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) 	
	{
		P p1 = new P();
		System.out.println("------");
        Q q1 = new Q();
		System.out.println("------");
        R r1 = new R();
		System.out.println("------");
        S s1 = new S();
		System.out.println("------");
        T t1 = new T();
	}
}
