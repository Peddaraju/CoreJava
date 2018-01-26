package com.corejava.part1.app13;
class C  
{
	C(int i)	
	{
		System.out.println("C(int)");
	}
    C()  
	{
		System.out.println("C()");
	}
}
class D extends C  
{
	D(int i)	
	{
		System.out.println("D(int)");
	}
}
class Manager1 
{
	public static void main(String[] args) 	
	{
		C c1 = new C(90);
		System.out.println("-----");
		D d1 = new D(80);
	}
}
