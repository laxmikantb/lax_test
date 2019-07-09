package com.example.laxexamples.dynamicprogramming;
import java.util.Scanner;

public class EqualsStackHeight {
	
	private static int getStackMinHeight(int[] stack_heights) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < stack_heights.length; i++) {
			min = Math.min(min, stack_heights[i]);
		}
		return min;
	}
	
	private static boolean heightEqual(int[] stack_heights) {
		int height = stack_heights[0];
		for(int h : stack_heights) {
			if(height != h) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        
        int h1[] = new int[n1];
        int h2[] = new int[n1];
        int h3[] = new int[n1];
        
        final int[][] stacks = {new int[n1], new int[n2], new int[n3]};
        final int[] stack_heights = {0, 0, 0};
        final int[] poparr = {0, 0 ,0};
        
                int j =0;
        for (j=0; j < h1.length; j++) {
        	stacks[0][j] = h1[j];
        	stack_heights[0] += h1[j];
        }
        for (j=0; j < h2.length; j++) {
        	stacks[1][j] = h2[j];
        	stack_heights[1] += h2[j];
        }
        for (j=0; j < h3.length; j++) {
        	stacks[2][j] = h3[j];
        	stack_heights[2] += h3[j];
        }
        
        int min = getStackMinHeight(stack_heights);
        
        while(!heightEqual(stack_heights)) {
        	for(int i = 0; i < stacks.length; i++) {
        		if(stack_heights[i] > min) {
        			stack_heights[i] -= stacks[i][poparr[i]];
        			poparr[i]++;
        			min = Math.min(min, stack_heights[i]);
        		}
        	}
        }
        
        System.out.println(min);
        
        in.close();
	}
}
