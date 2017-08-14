package com.lara;
class Hero 
{
	int i;
	void test()
	{
		System.out.println(i);
		i = 10;
	}
	public static void main(String[] args) 
	{
		Hero h1 = new Hero();
		System.out.println(h1.i);
		h1.test();
		System.out.println(h1.i);
		Hero h2 = h1;
		h1.i = 20;
		h2.test();
	}
}
