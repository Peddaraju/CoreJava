package com.corejava.part1.app11;
class F 
{
	F()  
	{
		System.out.println("F()");
	}

    {
		System.out.println("IIB");
	}

    F(int i)	
	{
		this();
		System.out.println("F(int)");
	}

    public static void main(String[] args) 	
	{
		F f1 = new F();
		System.out.println("-----");
        F f2 = new F(20);
		System.out.println("-----");
	}

}
