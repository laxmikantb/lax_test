import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * You are given a list of size , initialized with zeroes. You have to perform  operations on the list 
 * and output the maximum of final values of all the  elements in the list. For every operation, you are given three integers ,  
 * and  and you have to add value  to all the elements ranging from index  to (both inclusive).
 * 5 3
1 2 100
2 5 100
3 4 100
Sample Output

200
 */
public class AlgoCrush {

	public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int noofoperations = in.nextInt();
        
        long[] arr = new long[size];
        for (int i=0; i < size; i++) {
        	arr[i] = 0;
        }
        
        for (int i=0; i < noofoperations; i++) {
            int beginIndex = in.nextInt() - 1;
            int endIndex = in.nextInt() - 1;
            int addValue = in.nextInt();
            if (endIndex >= size) endIndex = size; 
            for (int j=beginIndex; j<endIndex; j++) {
            	arr[j] += addValue;
            }
        }
        
        long max =0;
        for (int i=0; i < size; i++) {
        	if (arr[i] > max) {
        		max = arr[i];
        	}
        }
        
        System.out.println(max);

	}

}
