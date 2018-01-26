package com.corejava.part1.app12;
class H 
{
	int x;
}
class I extends H  
{
	int y;
}
class J extends I  
{
	int z;
}
class Manager  
{
	public static void main(String[] args) 	
	{
		H h1 = new H();
        I i1 = new I();
        J j1 = new J();
        System.out.println(h1.x);
		System.out.println(i1.x);
        System.out.println(j1.x);
		System.out.println(i1.y);
        System.out.println(j1.y);
		System.out.println(j1.z);
	}
}
