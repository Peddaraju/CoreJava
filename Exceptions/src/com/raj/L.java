package com.raj;

public class L {
	public static void main(String[] args) {
		
		try {
			
			System.out.println(1);
			int i=10/0;
			System.out.println(2);
			
		} catch (ArithmeticException e) {
			System.out.println(3);
			e.printStackTrace();
			//System.out.println(e);
			System.out.println(4);
			
		}
		System.out.println(5);
	}

}
