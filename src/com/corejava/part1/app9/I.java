package com.corejava.part1.app9;
class I 
{
	int x;
	int y = 10;

	public static void main(String[] args) 	
	{
		I obj = new I();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.x = 20;
		obj.y = 40;
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}
