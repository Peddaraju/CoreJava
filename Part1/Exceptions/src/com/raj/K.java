package com.raj;

public class K {
	public static void main(String[] args) {
		System.out.println(1);
		try{
			System.out.println(2);
			int i=10/0;
			System.out.println(3);
		}
		catch(ArithmeticException ae){
			System.out.println(4);
			//System.out.println(ae);
			//System.out.println(ae.getMessage());
			ae.printStackTrace();
			System.out.println(5);
		}
		System.out.println(6);
		
	}

}
