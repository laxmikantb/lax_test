package com.example.laxexamples;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;


public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		l.add(null);
		l.add(4);
		l.add("M");
		l.add("N");
		l.add(2, "JJ");
		l.add(10);
		l.add(17);
		l.remove(3);
		
		ArrayList l1 = new ArrayList();
		LinkedList l2 = new LinkedList();
		
		System.out.println(l1 instanceof Serializable); // true
		System.out.println(l1 instanceof Cloneable); // true
		
		System.out.println(l2 instanceof Serializable); // true
		System.out.println(l2 instanceof Cloneable); // true
		System.out.println(l1 instanceof RandomAccess); // true
		System.out.println(l2 instanceof RandomAccess); // false
		
		System.out.println(l);
		
	}

}
