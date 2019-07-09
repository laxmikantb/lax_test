package org.lax.java8;

interface defIntf {
	default void m1() {
		System.out.println("default method from interface");
	}
}

public class DefaultTest implements defIntf {

	public void m1() {
		System.out.println("my own method ");
	}
	public static void main(String[] args) {
		DefaultTest test = new DefaultTest();
		test.m1();

	}

}
