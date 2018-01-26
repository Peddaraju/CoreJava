package com.corejava.part1.app9;
class M 
{
	int x;
	static void test(M obj)
	{
		obj.x = 10;
	}
	public static void main(String[] args) 
	{
		M m1 = new M();
		m1.x = 5;
		System.out.println(m1.x);//5
		test(m1);
		System.out.println(m1.x);//10
		m1 = null;
		System.out.println("abandoned");
		m1.x = 20;
		System.out.println(m1.x);
	}
}
