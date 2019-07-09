
public class ThreadJoinDemo {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		Thread.currentThread().join();
		
		
		SeethaThread t = new SeethaThread();
		 
		t.start();
		//t.join(10000); // wait for 10000 milliseconds for t1 otherwise continue execution
		
		
		
		t.join(); // wait until t completesits work
		for (int i=0; i < 10; i++)
		{
			System.out.println("Rama Thread");
		}

	}

}
