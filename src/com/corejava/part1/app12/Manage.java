package com.corejava.part1.app12;
class Programme
{
	int slaray = 40000;
}
class Programmer extends Programme
{
	int bonus = 10000;
	
}
class Manage
{
	public static void main(String[] args) 
	{
		Programmer pgr = new Programmer();
		System.out.println("Programmer salary is :" + pgr.slaray);
		System.out.println("Bonus of the Programmer is :" + pgr.bonus);
	}
}
