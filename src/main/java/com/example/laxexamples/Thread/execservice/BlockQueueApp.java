package com.example.laxexamples.Thread.execservice;

import java.util.Random;

public class BlockQueueApp {
	public static void main(String[] args) throws InterruptedException {
		final BlockQueue blockingQueue = new BlockQueue(10);
		final Random random = new Random();
		
		Thread t1 = new Thread(new Runnable() {
	        public void run() {
	            try {
	                while (true) {
	                    blockingQueue.put(new Integer(random.nextInt(10)).toString());
	                }
	            } catch (InterruptedException ignored) {}
	        }
	    });
		
	    Thread t2 = new Thread(new Runnable() {
	        public void run() {
	            try {
	                Thread.sleep(1000);//wait for putting to the queue first
	            } catch (InterruptedException ex) {
	                System.out.println("Exception " + ex.getMessage());
	            }
	            try {
	                while (true) {
	                    blockingQueue.consume();;
	                }
	            } catch (InterruptedException ignored) {}
	        }
	    });
	    
	    t1.start();
	    t2.start();
	    t1.join();
	    t2.join();
	}

}
