package com.corejava.part1.app13;
class A 
{
	A()  
	{
		System.out.println("A()");
	}
    A(int i)  
	{
		System.out.println("A(int)");
	}
 
}
class B extends A  
{
	B() 
	{
		System.out.println("B()");
	}
    B(int i)	
	{
		System.out.println("B(int)");
	}
    
}
class Manager  
{
	public static void main(String[] args) 	
	{
		A a1 = new A();
		System.out.println("-----");
        A a2 = new A(20);
		System.out.println("-----");
        B b1 = new B();
		System.out.println("-----");
        B b2 = new B(30);
		System.out.println("-----");
	}
}
