package com.corejava.part1.app10;
class Student
{
	int id;
	String name;
	int age;
	double weight;
	Student() 
	{
	}
	Student(int id)
	{
		this.id = id;
	}
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	Student(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	Student(int id, String name, int age, double weight)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	void display()
	{
		System.out.println(id + ":" + name + ":" + age + ":" + weight);
	}
	public static void main(String[] args) 
	{
		Student obj = new Student();
		obj.display();
		Student obj1 = new Student(12);
		obj1.display();
		Student obj2 = new Student(20, "john");
		obj2.display();
		Student obj3 = new Student(30, "john", 22);
		obj3.display();
		Student obj4 = new Student(30, "john", 22 , 60.50);
		obj4.display();
	}
}
