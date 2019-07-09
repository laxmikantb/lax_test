import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class ReverseIntegerArray {

	public static int[] reverse(int[] data) {
	    int left = 0;
	    int right = data.length - 1;

	    while( left < right ) {
	        // swap the values at the left and right indices
	        int temp = data[left];
	        data[left] = data[right];
	        data[right] = temp;

	        // move the left and right index pointers in toward the center
	        left++;
	        right--;
	    }
	   return data;
	}

	public static String reverseIntArray() {
		Stack s = new Stack();
		Scanner in = new Scanner(System.in);
		int numberOfElements = in.nextInt();
        for (int i = 0; i < numberOfElements; i++) {
            s.push(in.nextInt());
        }       
        in.close();
        StringBuffer sb=new StringBuffer();
        
        while(!s.empty()) {
            sb.append(s.pop() + " ");
        }
        return sb.toString();
	}
	public static void main(String[] args) throws IOException {
		Stack s = new Stack();
		Scanner in = new Scanner(System.in);
		int numberOfElements = in.nextInt();
        for (int i = 0; i < numberOfElements; i++) {
            s.push(in.nextInt());
        }       
        in.close();
        while(!s.empty()) {
            System.out.print(s.pop() + " ");
        }
	}
        
}
