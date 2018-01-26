package com.corejava.part1.app12;
class Circle
{
	int square(int n)
	{
		return n * n;
	}
}
class HasRelationExample 
{
	Circle circle;
	double pi = 3.14;
	double area(int radius)
	{
		circle = new Circle();
		int rsquare = circle.square(radius);
		return pi * rsquare;
	}
	public static void main(String[] args) 
	{
		HasRelationExample has
						= new HasRelationExample();
		double result = has.area(5);
		System.out.println(result);
	}
}
