package com.corejava.part1.app9;
class StudentData 
{
	int rollNo;
	String name;

	void insertRecord(int r, String n)
	{
		rollNo = r;
		name = n;
	}
	void displayInformation()
	{
		System.out.println(rollNo + ":" + name);
	}
	public static void main(String[] args) 
	{
		StudentData s1 = new StudentData();
		StudentData s2 = new StudentData();
		s1.insertRecord(111, "Karan");
		s2.insertRecord(222, "Aryan");
		s1.displayInformation();
		s2.displayInformation();
	}
}
