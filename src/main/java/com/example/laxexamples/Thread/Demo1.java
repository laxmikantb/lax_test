
public class Demo1 {

	public static void main(String[] args) {
		CustomerThread c1 = new CustomerThread("Thread 1");
		CustomerThread c2 = new CustomerThread("Thread 2");
		CustomerThread c3 = new CustomerThread("Thread 3");
		c1.start();
		c2.start();
		c3.start();
		

	}

}
