package com.lara;
class A
{
	static void test()
	{
		System.out.println("A-test");
	}
}
class B extends A
{
	static void test()
	{
		System.out.println("B-test");
	}
}
class Manager41 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new B();
		B b1 = new B();

		A[] x = new A[3];
		x[0] = a1;
		x[1] = a2;
		x[2] = b1;
		
		for(int i = 0; i < x.length; i++)
		{
			x[i].test();
		}
	}
}
