package com.lara;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class M{
	 
	@Retention(RetentionPolicy.RUNTIME)
	@Inherited
	public @interface CustomAnnotation{
	String value();
	}
	@CustomAnnotation("prince")
	public static class Parent{
	 
	}
	public static class Child extends Parent
	{
	} 
		public static void main(String[] args)
		{
				Parent parent = new Parent();
				Child child = new Child();
	 
				System.out.println("Parent class:");
				System.out.println("  getDeclaredAnnotations: " +
						parent.getClass().getDeclaredAnnotations().length);
				System.out.println("  getAnnotations: " +
						parent.getClass().getAnnotations().length );
	 
				System.out.println("Child class:");
				System.out.println("  getDeclaredAnnotations: " +
						child.getClass().getDeclaredAnnotations().length);
				System.out.println("  getAnnotations: " +
						child.getClass().getAnnotations().length);
	}
	 
}