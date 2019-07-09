package com.example.laxexamples.dynamicprogramming;
import java.util.Scanner;

public class IsPrime {
    public static boolean isPrime (int number) { 
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i=3; (i*i) <= number; i+=2) {
           if (number % i == 0 ) return false;
        }
       return true;
   }
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int p = in.nextInt();
       for(int a0 = 0; a0 < p; a0++){
           int n = in.nextInt();
           if (isPrime(n)) 
               System.out.println("Prime"); 
           else 
               System.out.println("Not prime");
       }
   }
}