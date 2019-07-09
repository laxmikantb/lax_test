
public class PrintJob implements Runnable {

	String name;
	
	PrintJob(String name) {
		this.name = name;
	};
	@Override
	public void run() {
		System.out.println( name + " job started by " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException ex){
			
		}
		System.out.println( name + " job Completed by " + Thread.currentThread().getName());
	}

}
