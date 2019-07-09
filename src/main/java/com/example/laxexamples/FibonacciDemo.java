package com.example.laxexamples;

public class FibonacciDemo {

	public static void main(String[] args) {
		//int n = Integer.parseInt(args[0]);
		int n = 7;
		for (int i =0; i <= n; i++)
		{
			System.out.println(" " + withoutRecursion(i));
		}

	}
	
	static int fibon1 = 0;
	static int fibon2 = 1;
	static int fibon3 = 0;
	
	public static int withoutRecursion(int count)
	{
		int n1=0;
		int n2=1;
		int n3= 0;
		
		//System.out.print(n1 + " " + n2); // printing 0 and 1
		for (int i=2; i < count; i++)
		{
			n3 = n1+n2;
			//System.out.print(" " + n3);
			n1=n2;
			n2=n3;
			
		}
		return n3;
	}
	
	public static int Fibo(int n)
	{
		if (n <=1)
		{
			return n;
		}
		return Fibo(n-1) + Fibo(n-2);
	}

}
