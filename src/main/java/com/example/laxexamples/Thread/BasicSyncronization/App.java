package com.example.laxexamples.Thread.BasicSyncronization;

import java.util.Scanner;

class Processor1 extends Thread
{
	private boolean running = true;
	public void run()
	{
		while(running)
		{
			System.out.println("Hello");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown()
	{
		running = false;
	}
}
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor1 proc1 = new Processor1();
		proc1.start();
		
		System.out.println("Press return to stop");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		proc1.shutdown();
		
	}
	
	/* Answer
	 * 
	 * Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
**/
	
}

