package com.example.laxexamples.concurrent;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList l1 = new ArrayList();
		l1.add("A");
		l1.add("B");
		
		CopyOnWriteArrayList l = new CopyOnWriteArrayList();
		l.add("A");
		l.add("C");
		l.addAll(l1);
		System.out.println(l);
		ArrayList l2 = new ArrayList();
		l2.add("A");
		l2.add("D");
		l.addAllAbsent(l2);
		System.out.println(l);
		
	}

}
