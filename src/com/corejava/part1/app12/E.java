package com.corejava.part1.app12;
class C 
{
	int i;
    void test()  
	{
		System.out.println("test");
	}
}
class D extends C  
{
	int j;
}
class E  
{
	public static void main(String[] args) 	
	{
		D d1 = new D();
        d1.i = 10;
		d1.j = 20;
        d1.test();
        System.out.println(d1.i);
		System.out.println(d1.j);
	}
}
