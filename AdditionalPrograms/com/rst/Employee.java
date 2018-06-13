package com.rst;
class Employee
{
	int slaray = 40000;
}
class Programmer extends Employee
{
	int bonus = 10000;
	
}
class Manager
{
	public static void main(String[] args) 
	{
		
		Programmer pgr = new Programmer();
		System.out.println("Programmer salary is :" + pgr.slaray);
		System.out.println("Bonus of the Programmer is :" + pgr.bonus);
		
		
	}
}
