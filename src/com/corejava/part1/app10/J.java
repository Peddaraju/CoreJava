package com.corejava.part1.app10;
class J 
{
	J(byte y) 
	{
		System.out.println("X(int y)");
	}
	J(int x)	
	{
		System.out.println("X(int x)");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 	
	{
		J obj = new J(90);
		System.out.println("done");
	}

}
