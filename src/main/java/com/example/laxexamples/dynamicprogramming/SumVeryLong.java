package com.example.laxexamples.dynamicprogramming;
import java.util.Scanner;

public class SumVeryLong {

	public static void main(String[] args) {

	        Scanner in = new Scanner(System.in);
	        int numberOfElements = in.nextInt();
	        long sumOfNumbers = 0L;
	        
	        for (int i = 0; i < numberOfElements; i++) {
	            sumOfNumbers += in.nextLong();
	        }
	        in.close();
	        System.out.println(sumOfNumbers);
	    }

	}
