package com.example.laxexamples.dynamicprogramming;

public class FindDigitInRange {
	public static void main(String[] args) {
        int n = 333, d = 3; 
        printNumbers(n, d); 
	}
	
	   // Returns true if d is present as digit 
    // in number x. 
    static boolean isDigitPresent(int x, int d) 
    { 
        while (x > 0) 
        { 
            if (x % 10 == d) 
                break; 
  
            x = x / 10; 
        } 
  
        return (x > 0); 
    } 
  
    static void printNumbers(int n, int d) 
    { 
        for (int i = 3; i <= 333; i++) 
  
            // checking for digit 
            if (i == d || isDigitPresent(i, d)) 
                System.out.print(i + " "); 
    } 
  
  
}
