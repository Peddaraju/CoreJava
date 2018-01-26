package com.corejava.part1.app12;
class M extends Object  
{
	M()  
	{
		super();
		System.out.println("M()");
	}
}
class N extends M  
{
	N() 
	{
		super();
		System.out.println("N()");
	}
}
class O extends N  
{
	O()  
	{
		super();
		System.out.println("O()");
	}
}
class Manager2  
{
	public static void main(String[] args) 	
	{
	   M m1 = new M();
	   System.out.println("-----");
       N n1 = new N();
	   System.out.println("-----");
       O o1 = new O();
	   System.out.println("-----");
	}
}
