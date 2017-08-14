package com.app4;

public class A extends Thread {
	@Override
	public void run() {
		
		System.out.println(10/0);
	}
	
	public static void main(String[] args) {
		A a=new A();
		Thread t=new Thread(a);
		t.start();
		doStuff();
	}

	private static void doStuff() {
		doMoreStuff();
	}

	private static void doMoreStuff() {
		System.out.println("from main");
	}
}
