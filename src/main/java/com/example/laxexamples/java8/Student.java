package org.lax.java8;

public class Student {
	String name;
	int mark;
	
	Student(String name, int mark) {
		this.name = name;
		this.mark = mark;
	}
	
	public String toString() {
		return name + " " + mark;
	}
	
}
