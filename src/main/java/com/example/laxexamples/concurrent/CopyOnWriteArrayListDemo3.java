package com.example.laxexamples.concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo3 {
	static CopyOnWriteArrayList l = new CopyOnWriteArrayList();
	
	public static void main(String[] args) throws InterruptedException {
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		CopyOnWriteArrayListDemo2 t = new CopyOnWriteArrayListDemo2();
		t.start();
		Iterator ie = l.iterator();
		
		while (ie.hasNext()) {
			String s = (String) ie.next();
			if (s.equals("D")) {
				ie.remove();
			}
		}
		System.out.println(l); // Runtime Exception java.lang.UnsupportedOpertaionException
	}
	
}
