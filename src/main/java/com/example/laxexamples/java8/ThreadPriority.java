package org.lax.java8;

public class ThreadPriority {

		public static void main(String[] args) {
			System.out.println("Thread Main Priority " + Thread.currentThread().getPriority());
			MyThread t = new MyThread();
			Thread.currentThread().setPriority(Thread.NORM_PRIORITY+1);
			t.setPriority(7);
			t.start();

			System.out.println("MyThread Priority " + t.getPriority());

			
		}
}
