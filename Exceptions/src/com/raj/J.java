package com.raj;

public class J {
	public static void main(String[] args) {
		System.out.println(1);
		try{
			int i=10/0;
		}
		catch(ArithmeticException ae){
			System.out.println(2);
			//System.out.println(ae);
			ae.printStackTrace();
			System.out.println(3);
		}
		System.out.println(4);
	}

}
