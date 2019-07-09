package org.lax.java8;

public interface pInterface {
	void m1();
	public static void m2() {
		System.out.println("Inside static method of interface");
	}
	
	public static void main(String[] args) { // can have static main inside in interface in 1.8
		System.out.println("Inside static main method of interface");
	}
}
