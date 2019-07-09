
public class ThreadSleepDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyChildThread m = new MyChildThread();
		NoInterruptedThread n = new NoInterruptedThread();
		m.start();
	n.start();
	n.interrupt();
		m.interrupt(); // sening interrupt to child thread
		System.out.println("End of main thread");
	}

}
