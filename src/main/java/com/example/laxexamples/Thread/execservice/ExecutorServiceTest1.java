package com.example.laxexamples.Thread.execservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExecutorServiceTest1 {

	public static void main(String[] args) {
	ExecutorService exec = Executors.newFixedThreadPool(2);

	exec.execute(new Runnable() {
	    public void run() {
	        throw new RuntimeException("Hello Error");
	    }
	});

	exec.shutdown();
	}

}
 