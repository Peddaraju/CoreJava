package com.corejava.part1.app14;
class D  
{
	D()  
	{
		System.out.println("D()");
	}

    static	
	{
		System.out.println("D-SIB");
	}

    {
		System.out.println("D-IIB");
	}
}
class E extends D  
{
	E()  
	{
		System.out.println("E()");
	}

    {
		System.out.println("E-IIB");
	}

    static	
	{
		System.out.println("E-SIB");
	}
}
class Manager  
{
	public static void main(String[] args) 	
	{
	     System.out.println("main begin");
         D d1 = new D();
	     System.out.println("-----");
         E e1 = new E();
	     System.out.println("main end");
	}
    static	
	{
	     System.out.println("SIB-Manager");
	}
}
class Manager1   
{
	public static void main(String[] args) 	
	{
	    System.out.println("main begin");
	    E e1 = new E();		
	    System.out.println("-----");
	    D d1 = new D();
	    System.out.println("main end");
	}
    static	
	{
	    System.out.println("SIB-Manager1");
	}
}
class Manager2 extends D 
{
	public static void main(String[] args) 	
	{
	     System.out.println("main begin");
	     E e1 = new E();		
	     System.out.println("-----");
	     D d1 = new D();
	     System.out.println("main end");
	}
    static	
	{
	     System.out.println("SIB-Manager2");
	}
}
class Manager3 extends E 
{
	public static void main(String[] args) 	
	{
	     System.out.println("main begin");
	     E e1 = new E();		
	     System.out.println("-----");
	     D d1 = new D();
	     System.out.println("main end");
	}
    static	
	{
	     System.out.println("SIB-Manager3");
	}
}
