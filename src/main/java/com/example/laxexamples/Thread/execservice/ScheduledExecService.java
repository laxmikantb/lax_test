package com.example.laxexamples.Thread.execservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecService {

	public static void main(String[] args) {
		ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
		Runnable task = () -> System.out.println("Scheduling " + System.nanoTime());
		ScheduledFuture<?> future = exec.schedule(task, 3, TimeUnit.SECONDS);
		try {
			TimeUnit.MICROSECONDS.sleep(1337);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long remainingDelay = future.getDelay(TimeUnit.MICROSECONDS);
		System.out.printf("Remaining Delay: %sms" , remainingDelay);
		
	}

}
