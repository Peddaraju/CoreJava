package com.corejava.part1.app10;
class L 
{
	L()  
	{
		System.out.println("L()");
	}
	L(int i)  
	{
		System.out.println("L(int)");
	}
	L(int i, int j)  
	{
		System.out.println("L(int, int)");
	}
	public static void main(String[] args) 	
	{
			L obj1 = new L();
			System.out.println("-----");
			L obj2 = new L(10);
			System.out.println("-----");
			L obj3 = new L(10, 20);
			System.out.println("-----");
	}
}
