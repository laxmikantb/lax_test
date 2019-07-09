package com.example.laxexamples.Thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class CountDownLatchDemo1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args)  {
		CountDownLatch l1= new CountDownLatch(2);
		ExecutorService exec = Executors.newFixedThreadPool(3);

		for (int i=0; i < 3; i++)
		{
			exec.submit(new Processor(l1));
		}
		
		try {
			l1.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// waits countdown becomes = 0;
		
		System.out.println("Exited");
	}

}

class Processor implements Runnable {
	private CountDownLatch latch;
	
	public Processor(CountDownLatch l) {
		this.latch = l;
	}
	
	public void run()
	{
		System.out.println("Started");
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException ex)
		{
			
		}
		latch.countDown();
	}
}
