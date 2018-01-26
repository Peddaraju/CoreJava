package com.corejava.part1.app9;
class L
{
	int i;
	static int j;

	public static void main(String[] args) 
	{
		L l1 = new L();
		l1.i = 10;
		j = 20;
		L l2 = new L();
		l2.i = 30;
		j = 40;
		System.out.println(l1.i);
		System.out.println(l2.i);
		System.out.println(j);
	}
}
