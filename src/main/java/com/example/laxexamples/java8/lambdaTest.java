package org.lax.java8;

interface Intf {
	public void m2();
}
public class lambdaTest {
	
	public int x  = 888;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lambda
		pInterface l = () -> { System.out.println("Hello"); };
		l.m1();
		
		pInterface.m2(); // static methid from interface
		
		lambdaTest test = new lambdaTest();
		test.m1();
		
		// (int a, int b) -> { System.out.println(a+b); }
		// s -> s.length();

	}
	
	public void m1() {
		System.out.println("Hello from test");
		Intf in = new Intf() {
			int x = 999;
			public void m2() {
				System.out.println("Inner x " + this.x);
				System.out.println("Class variable " + lambdaTest.this.x);
			}
		};
		in.m2();
		
		// lambda expression
		Intf if2 = () -> {
			int x = 1000; // local variable only , it is not instance variable
			System.out.println("Lambda x " + this.x); // this is referenced to current outer class member so output 888
		};
		if2.m2();
		}
	

}
