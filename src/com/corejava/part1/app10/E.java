package com.corejava.part1.app10;
class E 
{
	E()  
	{
		System.out.println("E()");
	}
	public static void main(String[] args) 	
	{
		E e1 = new E();
		System.out.println("----");
		E e2 = new E();
	}
}
