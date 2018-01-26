package com.corejava.part1.app11;
class A 
{
	A()  
	{	
		System.out.println("A()");
	}

	{
		System.out.println("IIB1");
	}

    {
		System.out.println("IIB2");
	}
	public static void main(String[] args) 	
	{
		A a1 = new A();
		System.out.println("-----");
		A a2 = new A();
		System.out.println("-----");
	}

}
