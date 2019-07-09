package org.lax.java8;

// same single abstract method in child interface in functional interface
@FunctionalInterface
public interface FuncInterfaceB extends FuncInterfaceA {
	public void m1();
}
