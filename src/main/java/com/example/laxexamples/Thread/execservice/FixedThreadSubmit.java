package com.example.laxexamples.Thread.execservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThreadSubmit {

	public static void main(String[] args) {
		 ExecutorService executor = Executors.newFixedThreadPool(2);//2 Threads
	        for (int i = 0; i < 2; i++) { // call the (Processor(i).run) 2 times with 2 threads
	            executor.submit(new LoopTaskA());
	        }
	        executor.shutdown();
	        System.out.println("All tasks submitted.");
	        try {
	            executor.awaitTermination(1, TimeUnit.DAYS);
	        } catch (InterruptedException ignored) {
	        }
	        System.out.println("All tasks completed.");

	}

}
