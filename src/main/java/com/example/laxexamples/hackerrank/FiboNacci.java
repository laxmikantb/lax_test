import java.util.HashMap;
import java.util.Map;

public class FiboNacci {
	static int fibon1 = 0;
	static int fibon2 = 1;
	static int fibon3 = 0;
	
	public static void main(String[] args) {
		final HashMap<Long, Long> fibonacciTable = new HashMap<>();
		
		int n=7;
		for (long i=0L; i <= n; i++) {
			System.out.println(Fibo(fibonacciTable,i));
		}
			
	}
	
	public static Long Fibo(HashMap<Long, Long> fibonacciTable, long n)
	{
		if (fibonacciTable.containsKey(n)) {
			return fibonacciTable.get(n);
		}
		if (n <=1)
		{
			fibonacciTable.put(n, n);
			return n;
		}
		
		return Fibo(fibonacciTable, n-1) + Fibo(fibonacciTable, n-2);
	}
}
