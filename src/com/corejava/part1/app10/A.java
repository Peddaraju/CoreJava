package com.corejava.part1.app10;
class A 
{
	int i;
	public static void main(String[] args) 	
	{
		A a1 = new A();
		System.out.println(a1.i);
        A a2 = new A();
		System.out.println(a2.i);
        A a3 = new A();
		System.out.println(a3.i);
		a1.i = 10;
		a2.i = 20;
		a3.i = 30;
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a3.i);
	}
}
