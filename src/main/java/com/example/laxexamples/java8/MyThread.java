package org.lax.java8;

public class MyThread extends Thread {
	public void run() {
		System.out.println("MyThread Priority " + Thread.currentThread().getPriority());
	}
}
