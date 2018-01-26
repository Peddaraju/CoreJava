package com.corejava.part1.app10;
class H 
{
	H(int i)
	{
		System.out.println("H(int)");
	}

	public static void main(String[] args) 	
	{
		H h1 = new H(20);
		System.out.println("----");
		H h2 = new H(10);
		System.out.println("----");
		//H h3 = new H();
		System.out.println("----");
	}

}
