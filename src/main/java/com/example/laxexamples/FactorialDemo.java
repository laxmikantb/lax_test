package com.example.laxexamples;

public class FactorialDemo {
   public static void main(String[] args)
   {
	   System.out.println("Factorail of 4 is " + factorial(4) + " " + countFactorialsZero(19));
	   
	   
   }
   
   public static int countFactorialsZero(int num)
   {
	   int count = 0;
	   for (int i =2; i <= num; i++)
	   {
		   count += factorsof5(i);
	   }
	   return count;
   }
   public static int factorial(int n)
   {
	   if (n==0) return 1;
	   return n * factorial(n-1);
   }
   
   public static  int factorsof5(int i)
   {
	   int count=0;
	   while (i%5 ==0)
	   {
		   count++;
		   i/=5;
	   }
	   return count;
   }
}
