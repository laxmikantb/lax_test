package org.lax.java8;

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("child thread : Annonymous Inner Runnable class");
				
			}
			
		};
		
		Thread t = new Thread(r);
		t.start();

	
		Runnable r1 = () -> {
				System.out.println("child thread : uing lambda Annonymous Inner Runnable class");
			
		};
		
		Thread t2 = new Thread(r);
		t2.start();

		for (int i=0; i <10; i++) {
			System.out.println("Main thread");
		}
	}

}
