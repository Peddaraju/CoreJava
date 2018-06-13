package com.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	private static final int NTHREADS = 10;
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(NTHREADS);
		
		for(int i=0; i <= 500; i++){
			Runnable worker = new CountDigits(10000000L +i);
			executor.execute(worker);
		}
		// This will make the executor accept no new threads
        // and finish all existing threads in the queue
        executor.shutdown();
        // Wait until all threads are finish
        //executor.awaitTermination(0, null);
        System.out.println("Finished all threads");
	}
	
	/*public static void main(String[] args) {
		// We will store the threads so that we can check if they are done
        List<Thread> threads = new ArrayList<Thread>();
        // We will create 500 threads
        for (int i = 0; i < 10; i++) {
                Runnable task = new CountDigits(10000000L + i);
                Thread worker = new Thread(task);
                // We can set the name of the thread
                worker.setName(String.valueOf(i));
                // Start the thread, never call method run() direct
                worker.start();
                // Remember the thread for later usage
                threads.add(worker);
        }
        int running = 0;
		do {
			running = 0;
			for (Thread thread : threads) {
				if (thread.isAlive()) {
					running++;
				}
			}
			System.out.println("We have " + running + " running threads. ");
		} while (running > 0);
	}*/
}
