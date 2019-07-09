package com.example.laxexamples.Thread.BasicSyncronization;

import java.util.LinkedList;
import java.util.Random;


public class Processor {

	/**
	 * @param args
	 */
	
	private LinkedList<Integer> list = new LinkedList<Integer>();
	private final int LIMIT = 10;
	private Object lock = new Object();
	
	public void produce() throws InterruptedException
	{
		int value = 0;
		
		while (true)
		{
			synchronized (lock) {
				while(list.size() == LIMIT)
				{
					lock.wait();
				}
				list.add(value++);
			}
			
		}
	}
	
	public void consume() throws InterruptedException
	{
		Random random = new Random();
		
		while (true)
		{
			synchronized (lock)
			{
				while(list.size() == 0)
				{
					lock.wait();
				}
				
				System.out.println(" List size is " + list.size());
				int value = list.removeFirst();
				System.out.println(" Value " + value);
				lock.notify();
			}
			
			Thread.sleep(random.nextInt(1000));
		}
	}
	
	public static void main(String[] args) {
		
			final Processor p1 = new Processor();
			
			Thread t1 = new Thread(new Runnable() {
				public void run()
				{
					try {
						p1.produce();
					}
					catch (InterruptedException ex)
					{
						
					}
				}
			});
			
			Thread t2 = new Thread(new Runnable() {
				public void run()
				{
					try {
						p1.consume();
					}
					catch (InterruptedException ex)
					{
						
					}
				}
			});
			
			t1.start();
			t2.start();
			
			try {
				t1.join();
				t2.join();
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		
/* Answer 
 *  List size is 10
 Value 0
 List size is 10
 Value 1
 List size is 10
 Value 2
 List size is 10
 Value 3
 List size is 10
 Value 4
 List size is 10
 Value 5
 List size is 10
 Value 6
 List size is 10
 Value 7
 List size is 10
 Value 8
 List size is 10
 Value 9
 List size is 10
 Value 10
 List size is 10
 Value 11
 List size is 10
 Value 12

 */
}

