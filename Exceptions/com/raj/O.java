package com.raj;

public class O {
	public static void main(String[] args) {
		System.out.println(1);
		int i=10/0;
		try {
			
			System.out.println(2);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println(3);
		}
		System.out.println(4);
	}

}
