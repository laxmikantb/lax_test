interface Executable {
	void execute();
	
}
class Runner{
	public void run(Executable e) {
		System.out.println("Executing code block");
	}
}
public class App {

	public static void main(String[] args) {
		Runner r = new Runner();
		r.run(new Executable() {
			public void execute() {
				System.out.println("Hello There");
			}

		});
		
		
		System.out.println("===========================");
		r.run(() -> {
			System.out.println("Thisis passed in lambada expression");
			System.out.println("Hello There");
		});
	}

}
