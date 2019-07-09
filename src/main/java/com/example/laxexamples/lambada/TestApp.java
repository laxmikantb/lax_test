interface Executable {
	int execute();
	
}
class Runner{
	public void run(Executable e) {
		System.out.println("Executing code block");
		int value = e.execute();
		System.out.println("Returned value is " + value);
	}
}
public class App {

	public static void main(String[] args) {
		Runner r = new Runner();
		r.run(new Executable() {
			public int execute() {
				System.out.println("Hello There");
				return 6;
			}

		});
		
		
		System.out.println("===========================");
		r.run(() -> {
			System.out.println("Thisis passed in lambada expression");
			System.out.println("Hello There");
			return 8;
		});
	}

}