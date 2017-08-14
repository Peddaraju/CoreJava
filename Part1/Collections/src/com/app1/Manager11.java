package com.app1;

import java.util.PriorityQueue;

class A implements Comparable {
	int i;

	A(int i) {
		this.i = i;
	}

	@Override
	public boolean equals(Object obj) {
		A a = (A) obj;
		try {
			if (this.i == a.i)
				return true;
			else
				return false;
		} catch (ClassCastException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return i;
	}

	@Override
	public int compareTo(Object obj) {
		return i - ((A) obj).i;
	}

	@Override
	public String toString() {
		return Integer.toString(i);
	}
}

public class Manager11 {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.add(new A(9));
		queue.add(new A(5));
		queue.add(new A(8));
		queue.add(new A(29));
		queue.add(new A(90));
		queue.add(new A(19));
		queue.add(new A(1));
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);

	}
}
