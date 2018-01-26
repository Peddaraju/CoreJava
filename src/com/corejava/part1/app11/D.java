package com.corejava.part1.app11;
class D 
{
	static
	{
		System.out.println("SIB");
	}

    {
		System.out.println("IIB");
	}

    public static void main(String[] args) 	
	{
		D d1 = new D();
		System.out.println("-----");
        D d2 = new D();
		System.out.println("-----");
	}
}
