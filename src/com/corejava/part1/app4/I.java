package com.corejava.part1.app4;
final class I 
{
	static int i;

	public static void main(String[] args) 
	{
		System.out.println("a:" + I.i);
		int i = 20;
		System.out.println("b:" + I.i);
		System.out.println("c:" + i);
		i = 30;
		I.i = 40;
		System.out.println("d:" + I.i);
		System.out.println("e:" + i);
	}
	
	public void add() {
		System.out.println("fkjdkf");
	}
	
	
}
