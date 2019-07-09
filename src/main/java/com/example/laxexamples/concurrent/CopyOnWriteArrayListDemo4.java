package com.example.laxexamples.concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo4 {
	static CopyOnWriteArrayList l = new CopyOnWriteArrayList();
	
	public static void main(String[] args) throws InterruptedException {
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		CopyOnWriteArrayListDemo2 t = new CopyOnWriteArrayListDemo2();
		t.start();
		Iterator ie = l.iterator();
		l.add("E");
		while (ie.hasNext()) {
			String s = (String) ie.next();
			System.out.println(s);
		}
		System.out.println(l); // Runtime Exception java.lang.UnsupportedOpertaionException
	}
}
