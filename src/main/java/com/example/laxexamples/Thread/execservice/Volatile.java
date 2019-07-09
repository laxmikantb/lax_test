package com.example.laxexamples.Thread.execservice;

import java.util.Scanner;

public class Volatile extends Thread 
{

	    private volatile boolean running = true;

	    public void run() {
	        while (running) {
	            System.out.println("Running");

	            try {
	                Thread.sleep(50);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    public void shutdown() {
	        running = false;
	    }
	
	    public static void main(String[] args) {
	        Volatile pro = new Volatile();
	        pro.start();
	        // Wait for the enter key
	        System.out.println("Enter something to stop the thread,\nVolatile variable running will be forced to true :");
	        new Scanner(System.in).nextLine();
	        pro.shutdown();
	    }
	
}
