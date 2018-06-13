package com.app;

import java.util.Arrays;
import java.util.Comparator;


class A1 
{
	String name;
	int age;
	double weight;
	public A1() {
	}
	public A1(String name, int age, double weight)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "A1 [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	static class Aname implements Comparator<A1>
	{
		@Override
		public int compare(A1 o1, A1 o2) {
			return o1.name.compareTo(o2.name);
		}
	}
	
	static class Aage implements Comparator<A1>
	{
		@Override
		public int compare(A1 age1, A1 age2) {
			
			return age2.age-age1.age;
		}
		
	}
	
}

public class Test {
	public static void main(String[] args) {
		
		A1 a[] ={ 
					new A1("raj", 22, 65),
					new A1("ramu", 34, 67),
					new A1("abc", 21, 46)
				};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a ,new A1.Aname());
		System.out.println(Arrays.toString(a));
		Arrays.sort(a, new A1.Aage());
		System.out.println(Arrays.toString(a));
	}
}
