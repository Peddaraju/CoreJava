package com.corejava.part1.app10;
class S 
{
	S()  
	{
		System.out.println("S()");
	}

	{
		System.out.println("IIB");
	}
	
	public static void main(String[] args) 	
	{
		S s1 = new S();
		System.out.println("------");
		S s2 = new S();
		System.out.println("------");
	}

}
