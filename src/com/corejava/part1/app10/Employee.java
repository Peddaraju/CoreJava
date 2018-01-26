package com.corejava.part1.app10;

class Employee 
{
	int id;
	String name;
	Employee(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}
	
	Employee(Employee emp)
	{
		id = emp.id;
		name = emp.name;
	}
	void display()
	{
		System.out.println(id + "=" + name);
	}
	public static void main(String[] args) 
	{
		Employee emp = new Employee(111, "hero");
		
		Employee emp1 = new Employee(emp);
		emp.display();
		emp1.display();
		
	}
}
