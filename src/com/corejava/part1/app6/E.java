package com.corejava.part1.app6;
class E 
{
	static int i = 10;
	static int j = i;
	//static int k = m;
	static int m = j;
	public static void main(String[] args) 	
	{
		System.out.println(i);
		System.out.println(j);
		//System.out.println(k);
		System.out.println(m);
	}
}
