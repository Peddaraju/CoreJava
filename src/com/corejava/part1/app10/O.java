package com.corejava.part1.app10;
class O 
{
	O() 
	{
		this(2, 5);
		System.out.println("O()");
	}
	O(int i)	
	{
		this();
		System.out.println("O(int)");
	}
    O(int i, int j) 
	{
	    System.out.println("O(int, int)");
	}
	public static void main(String[] args) 	
	{
		O o1 = new O();
		System.out.println("-----");
		O o2 = new O(10);
		System.out.println("-----");
		O o3 = new O(10, 30);
		System.out.println("-----");
	}

}
