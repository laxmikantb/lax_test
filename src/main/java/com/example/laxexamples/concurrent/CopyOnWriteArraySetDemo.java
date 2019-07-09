package com.example.laxexamples.concurrent;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {

	public static void main(String[] args) {
		CopyOnWriteArraySet s = new CopyOnWriteArraySet();
		s.add("D");
		s.add("B");
		s.add("C");
		s.add("A");
		s.add(null);
		s.add(10);
		s.add("D");
		System.out.println(s);
	}

}
