package com.example.laxexamples.dynamicprogramming;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSortInversions {
// divide and conqour 
	// o log n
	 public static long mergeSort(int[] a){
	        int n = a.length;
	        
	        // Base Case
	        if(n <= 1) {
	            return 0;
	        }
	        
	        // Recursion 
	        int mid = n >> 1;
	        int[] left = Arrays.copyOfRange(a, 0, mid);
	        int[] right = Arrays.copyOfRange(a, mid, a.length);
	        long inversions = mergeSort(left) + mergeSort(right);
	        
	        int range = n - mid;
	        int iLeft = 0;
	        int iRight = 0;
	        for(int i = 0; i < n; i++) {
	            if(iLeft < mid && (iRight >= range || left[iLeft] <= right[iRight]))
	            {
	                a[i] = left[iLeft++];
	                inversions += iRight;
	            }
	            else if(iRight < range) 
	            {
	                a[i] = right[iRight++];
	            }
	        }
	        
	        return inversions;
	    }
	  
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();
	        
	        for(int i = 0; i < t; i++){
	            int n = scanner.nextInt();
	            int[] a = new int[n];
	            
	            for(int j = 0; j < n; j++){
	                a[j] = scanner.nextInt();
	            }
	            
	            System.out.println(mergeSort(a));
	        }
	        
	        scanner.close();
	    }
}
