package org.lax.java8;

public interface IntfWithDefaultMethod {
	
	default void m1() {
		System.out.println("Default m1 ");
	}
}
