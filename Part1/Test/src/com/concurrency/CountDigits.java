package com.concurrency;

public class CountDigits implements Runnable {

	private final long countUntil;
	
	public CountDigits(long countUntil) {
		this.countUntil = countUntil;
	}
	@Override
	public void run() {
		long sum = 0;
		for(long l = 0; l < countUntil; l++) {
			sum += l;
		}
		System.out.println(sum);
	}
}
