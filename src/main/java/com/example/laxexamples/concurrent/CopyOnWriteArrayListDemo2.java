package com.example.laxexamples.concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo2 extends Thread {
	static CopyOnWriteArrayList l = new CopyOnWriteArrayList();
	
	public static void main(String[] args) throws InterruptedException {
		l.add("A");
		l.add("B");
		CopyOnWriteArrayListDemo2 t = new CopyOnWriteArrayListDemo2();
		t.start();
		Iterator ie = l.iterator();
		
		while (ie.hasNext()) {
			String s = (String) ie.next();
			System.out.println(" Main Thread  Iterator ");
			Thread.sleep(3000);
		}
		System.out.println(l);
	}
	
	public void run() {
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {}
		System.out.println("Child Thread updating List");
		l.add("C");
	}
}
