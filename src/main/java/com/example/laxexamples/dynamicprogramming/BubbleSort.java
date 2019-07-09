package com.example.laxexamples.dynamicprogramming;
import java.util.Scanner;

public class BubbleSort {
	// o(n) already sorted
	// worst and average == o n^2
	static void swap(int[] a, int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}
	
	static int bubbleSort(int[] a) {
		int swapNum = 0;
		for (int i = 0; i < a.length; i++) {
			// Track number of elements swapped during a single array traversal
			int numberOfSwaps = 0;

			for (int j = 0; j < a.length - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					numberOfSwaps++;
					swapNum++;
				}
			}

			// If no elements were swapped during a traversal, array is sorted
			if (numberOfSwaps == 0) {
				break;
			}
		}

		return swapNum;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numofelements = in.nextInt();
		int[] arr = new int[numofelements];
		for (int count=0; count < numofelements; count++)
		{
	       	arr[count] = in.nextInt();
		}
		
		int numOfIterations = bubbleSort(arr);
		System.out.println("Array is sorted in " + numOfIterations + " swaps.");
		System.out.println("First Element: " + arr[0]  );
		System.out.println("Last Element: " + arr[arr.length-1]  );

	}

}
