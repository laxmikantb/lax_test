package org.lax.java8;

public class TestDefaultOverride implements IntfWithDefaultMethod  {
	public void m1() {
		System.out.println("override m1");
	}
	
	public static void main(String[] args) {
		TestDefaultOverride t = new TestDefaultOverride();
		t.m1();
	}

}
