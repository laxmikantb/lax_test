package org.lax.java8;

public class TestLeftRightIntf implements LeftInterface, RightInterface {

	 public void m1() {
		 LeftInterface.super.m1(); // specifies which defauilt method for same name function
	 }
}
