package com.corejava.part1.app11;
class E 
{
	static	
	{
		System.out.println("SIB1");
	}

    {
		System.out.println("IIB1");
	}

    static	
	{
		System.out.println("SIB2");
	}

    E()	
	{
		System.out.println("E()");
	}
    public static void main(String[] args) 	
	{
	    System.out.println("main begin");
        E e1 = new E();
	    System.out.println("-------");
        E e2 = new E();
	    System.out.println("main end");
	}

    {
		System.out.println("IIB2");
	}
}
