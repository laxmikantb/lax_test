import java.util.LinkedList;
import java.util.Scanner;


public class LeftRotation {
	public static void main(String[] args) 
	{
		LinkedList<Integer> queue = new LinkedList<Integer>();
	    Scanner scan = new Scanner(System.in); 
        int numberOfElements = scan.nextInt();;
        int numberOfrotations = scan.nextInt();
        
        for (int i=0; i < numberOfElements; i++)
        	queue.offer(scan.nextInt());
        

        
        for(int i=0; i < numberOfrotations; i++){
        	int value = queue.poll();
        	queue.offer(value);
        }

        scan.close();
        
        StringBuffer sb = new StringBuffer();
        while(!queue.isEmpty()) {
        	sb.append(queue.poll() + " ");
        }
        
        System.out.println(sb.toString());
		
	}
	
	private static void leftRotate(int[] arr, int offset)
	{
		if (arr == null || offset <0 )
			throw new IllegalArgumentException("The array must be no null and order should be non-negative");
		int shifts = arr.length - offset;
		if (shifts >  0)
		{
			int[] copy = arr.clone();
		    for (int j=0; j < shifts; j++) {
		    	arr[j] = arr[j+offset];
		    }
		    for (int i=0; i < offset; i++) {
		    	arr[i+shifts] = copy[i];
		    }
		}
		
	}
	
	private static void rotateLeft(int[] arr, int order) {
	    if (arr == null || order < 0) {
	        throw new IllegalArgumentException("The array must be non-null and the order must be non-negative");
	    }
	    int offset = arr.length - order % arr.length;
	    if (offset > 0) {
	        int[] copy = arr.clone();
	        for (int i = 0; i < arr.length; ++i) {
	            int j = (i + offset) % arr.length;
	            arr[i] = copy[j];
	        }
	    }
	}
	
	private static void rotateRight(int[] data, int order) {
		int[] result = data.clone();
		for(int i = 0; i < data.length; i++){
			result[(i+order) % data.length ] = data[i];
		}
	}
	private static void rotateLeft2(int[] data, int order) {
		int[] result = data.clone();
		for(int i = 0; i < data.length; i++){
		    result[(i+(data.length-order)) % data.length ] = data[i];
		}
	}
	
	
}
