import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RunningMedian {

	public static double[] getMedians(int[] array) {
		PriorityQueue<Integer> leftBucket = new PriorityQueue<Integer>( 
				new Comparator<Integer>() {
					public int compare(Integer a, Integer b) { return -1 * a.compareTo(b); } // keep the bigger int on top
				});
		PriorityQueue<Integer> rightBucket = new PriorityQueue<Integer>(); // natural sorted - lowest on top
		double[] medians = new double[array.length];
		int number;
		for (int i = 0; i < array.length; i++) {
			number = array[i];
			addRunningInput(number, leftBucket, rightBucket);
			balanceBuckets(leftBucket, rightBucket);
			medians[i] = getMedian(leftBucket, rightBucket);
		}
		return medians;
	}
	
	private static void balanceBuckets(PriorityQueue<Integer> leftBucket, PriorityQueue<Integer> rightBucket) {
		PriorityQueue<Integer> smallerBucket = leftBucket.size() > rightBucket.size() ? rightBucket : leftBucket;
		PriorityQueue<Integer> biggerBucket = leftBucket.size() > rightBucket.size() ? leftBucket : rightBucket;
		
		if (biggerBucket.size() - smallerBucket.size() >= 2) {
			smallerBucket.offer(biggerBucket.poll());
		}
	}

	private static void addRunningInput(int number, PriorityQueue<Integer> leftBucket, PriorityQueue<Integer> rightBucket) {
		if (leftBucket.size() == 0 || number < leftBucket.peek()) {
			leftBucket.offer(number);
		}
		else
		{
			rightBucket.offer(number);
		}
	}

	private static double getMedian(PriorityQueue<Integer> leftBucket, PriorityQueue<Integer> rightBucket) {
		PriorityQueue<Integer> smallerBucket = leftBucket.size() > rightBucket.size() ? rightBucket : leftBucket;
		PriorityQueue<Integer> biggerBucket = leftBucket.size() > rightBucket.size() ? leftBucket : rightBucket;
		
		if (biggerBucket.size() == smallerBucket.size()) {
			return ( (double) (biggerBucket.peek() + smallerBucket.peek())) / 2;
		}
		else
		{
			return ((double) biggerBucket.peek());
		}
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        double[] medians = getMedians(a);
        for (int indx=0; indx < medians.length; indx++)
        	System.out.println(medians[indx]);
	}

}
