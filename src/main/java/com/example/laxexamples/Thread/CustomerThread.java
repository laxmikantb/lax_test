
public class CustomerThread extends Thread {
	static Integer custid=0;
	private static ThreadLocal tl = new ThreadLocal() {
		protected  Integer initialValue() {
			return ++custid;
		}
	};
	
	CustomerThread(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + " executing " + tl.get());
	}

}
