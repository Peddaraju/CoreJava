package com.corejava.part1.app13;
class G 
{
	G(int i)	
	{
		System.out.println("G(int)");
	}
}
class H extends G  
{
	H()  
	{
		super(10);
		System.out.println("H()");
	}
}
class Manager3  
{
	public static void main(String[] args) 	
	{
		G g1 = new G(90);
		System.out.println("-----");
		H h1 = new H();
	}
}
