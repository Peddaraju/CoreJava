package com.corejava.part1.app10;
class K 
{
	K(int i, int j)  
	{
		System.out.println("int, int");
	}
	K(double i, int j) 
	{
		System.out.println("double, int");
	}
	public static void main(String[] args) 	
	{
			K obj1 = new K(10, 20);
			System.out.println("-----");
			K obj2 = new K(10.9, 20);
			System.out.println("-----");
	}

}
