import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Thread ran theold way");
			}
		}).start();
		
		// Lambada way
		new Thread(() -> System.out.println("Thread ran the new way")).start();
		
		numbers.forEach(value -> System.out.println(value));
		int sum = sumAll(numbers, n -> n % 2 == 0);
		
		System.out.println("Sum for even numbers " + sum);;
		
		sum = sumAll(numbers, n -> n > 3);
		System.out.println("Sum for > 3 numbers " + sum);;
		
		/*
		System.out.println(
			    numbers.stream()
			            .filter(isEven)
			            .map(doubleIt)
			            .filter(isGreaterThan5)
			            .findFirst()
			);
			*/
	}
	
	public static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
	    int total = 0;
	    for (int number : numbers) {
	        if (p.test(number)) {
	            total += number;
	        }
	    }
	    return total;
	}
	
	public static boolean isEven(int number) {
	    return number % 2 == 0;
	}

	public static int doubleIt(int number) {
	    return number * 2;
	}

	public static boolean isGreaterThan5(int number) {
	    return number > 5;
	}

}
