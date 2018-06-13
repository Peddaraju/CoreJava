package com.lara;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class K 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class c1 = Class.forName("com.lara.J");
		System.out.println("superclass: "+c1.getSuperclass());
		System.out.println("-----------");
		Field f1[] = c1.getDeclaredFields();
		Constructor co[] = c1.getConstructors();
		Method m1[] = c1.getDeclaredMethods();
		for(int i=0;i<f1.length;i++)
		{
			System.out.println(f1[i]);
		}
		System.out.println("-------------");
		for(int i=0;i<co.length;i++)
		{
			System.out.println(co[i]);
		}
		System.out.println("-----------");
		for(int i=0;i<m1.length;i++)
		{
			System.out.println(m1[i].getName());
		}
		System.out.println("--------------");
		Field f2[] = c1.getFields();
		for(int i=0;i<f1.length;i++)
		{
			System.out.println(f1[i].getType()+" : "+f1[i].getName());
		}
		System.out.println("------------");
	}
}
