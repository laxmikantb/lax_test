package com.example.laxexamples.dynamicprogramming;
import java.util.Scanner;

public class MiniMaxSum {

	private static long SUM = 0;
	private static long MIN = 0;
	private static long MAX = 0;
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        MiniMaxSum solution = new MiniMaxSum();
        SUM = MIN = solution.sum(arr, 0, false); // sum of all elements in an array
        long sum = 0;
        for (int index=0; index < arr.length; index++) {
        	sum = SUM - arr[index];
        	if (sum < MIN)
        		MIN = sum;
        	if (sum > MAX) {
        		MAX=sum;
        	}
        }
        System.out.println(MIN + " " + MAX);
	}
    
   
    public long sum(int[] arr, int ignore_elementIndex, boolean enableIgnore) {
    	long sum = 0;
    	for (int index=0; index < arr.length; index++ )
    	{
    		if (index == ignore_elementIndex) {
    		   	if (!enableIgnore) {
    		   		sum += arr[index];
    		   	}
    		}
    		else
    		{
    			sum += arr[index];
    		}
    	}
    	return sum;
	}

}
 