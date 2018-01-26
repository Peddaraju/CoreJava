package com.corejava.part1.app14;
class A 
{
	static	
	{
		System.out.println("A-SIB");
	}
    A()  
	{
		System.out.println("A()");
	}
    {
		System.out.println("A-IIB");
	}
}
class B extends A  
{
	static	
	{
		System.out.println("B-SIB");
	}
    {
		System.out.println("B-IIB");
	}
    B()  
	{
		System.out.println("B()");
	}
}
class C extends B  
{
	C()  
	{
		System.out.println("C()");
	}
	{
		System.out.println("C-IIB");
	}
    static	
	{
		System.out.println("C-SIB");
	}
    public static void main(String[] args) 	
	{
	    System.out.println("main begin");
	    A a1 = new A();
	    System.out.println("------");
	    B b1 = new B();
	    System.out.println("------");
	    C c1 = new C();
	    System.out.println("main end");
	}
}
