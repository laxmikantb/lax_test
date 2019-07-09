import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		PrintJob[] jobs = {
				new PrintJob("durga"),
				new PrintJob("Ravi"),
				new PrintJob("Anil"),
				new PrintJob("Suresh"),
				new PrintJob("Shiva"),
				new PrintJob("Paven")
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (PrintJob j : jobs) {
			service.submit(j);
		}
		service.shutdown();
	}

}
