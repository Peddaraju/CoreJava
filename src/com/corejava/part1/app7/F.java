package com.corejava.part1.app7;
class F 
{
	static int i = test1();
	static int test1() 
	{
		System.out.println(1);//1
		test2();//2
		System.out.println(2);//8
		return 10;//9
	}
	static void test2() 
	{
		System.out.println(3);//3
		main(null);//4
		System.out.println(4);//7
	}
	static	
	{
	    System.out.println(5 + ":" + i);//10
	    i = 20;//11
	    main(null);//12
	    System.out.println(6 + ":" + i);//15
	}
	public static void main(String[] args) 	
	{
	    System.out.println(7 + ":" + i);//5, 13, 16
	    i = 30;//6, 14, 17
	}
}
