package com.raj;

class Q
{
	int n;
	boolean valueSet=false;
	synchronized int get()
	{
		if(!valueSet)
			try {
				wait();
			} catch (Exception e) {
				System.out.println("intrupted exception");
			}
		System.out.println("get"+n);
		valueSet=false;
		notify();
		return n;
	}
	synchronized void put(int n)
	{
		if(valueSet)
			try {
				wait();
			} catch (Exception e) {
				System.out.println("intrupted exception");
			}
		this.n=n;
		valueSet=true;
		System.out.println("put"+n);
		notify();
	}
}
class Producer implements Runnable
{
	Q q;
	Producer(Q q)
	{
		this.q=q;
		new Thread(this,"Producer").start();
	}
	@Override
	public void run() {
		int i=0;
		while(true)
		{
			q.put(i++);
		}
		
	}
}
class Consumer implements Runnable
{
	Q q;
	Consumer(Q q)
	{
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	@Override
	public void run() {
		int i=0;
		while(true)
		{
			q.get();
		}
		
	}
	
}
public class MultiThredWait {
	public static void main(String[] args) {
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("pres Ctr-c to stop");
		
	}
	
	
	
	

}
