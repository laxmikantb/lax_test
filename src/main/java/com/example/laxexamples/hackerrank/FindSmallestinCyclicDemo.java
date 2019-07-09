import java.util.ArrayList;
import java.util.List;

public class FindSmallestinCyclicDemo {
	
	public static int findMin(int[] num) {
		return findMin(num, 0, num.length - 1);
	}
	 
	public static int findMin(int[] num, int left, int right) {
		if (left == right)
			return num[left];
		if ((right - left) == 1)
			return Math.min(num[left], num[right]);
	 
		int middle = left + (right - left) / 2;
	 
		// not rotated
		if (num[left] < num[right]) {
			return num[left];
	 
		// go right side
		} else if (num[middle] > num[left]) {
			return findMin(num, middle, right);
	 
		// go left side
		} else {
			return findMin(num, left, middle);
		}
	}
	
	public static void main(String[] args) {

	   int[] arr = { 378, 478, 550, 631, 103, 203, 220, 234, 279, 368 };
	   System.out.println(findMin(arr));

	}

}
