package org.lax.java8;

interface mInterface {
	public void m1();
}


interface mInterface2 {
	public MethidReferenceTest get();
}

public class MethidReferenceTest {

	MethidReferenceTest() {
		System.out.println("MethidReferenceTest Construtor");
	}
	
	public static void m2() {
		System.out.println("Methd reference");
	}
	
	public void m3() {
		System.out.println("Instance Methd reference");
	}
	
	public static void main(String[] args) {
		mInterface i = () -> { System.out.println("Lambda expression"); };
		i.m1();
		
		// static methid reference
		mInterface i2 = MethidReferenceTest::m2;
		i2.m1();

		// instance method reference
		MethidReferenceTest test = new MethidReferenceTest();
		mInterface i3 = test::m3;
		i3.m1();
		
		// Constructor reference
		mInterface2 i4 = MethidReferenceTest::new;
		MethidReferenceTest test2 = i4.get();
		
		
		Runnable r =  test::m3;
		Thread t= new Thread(r);
		t.start();
	}

}
