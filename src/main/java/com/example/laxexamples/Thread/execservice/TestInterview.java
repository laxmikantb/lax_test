package com.example.laxexamples.Thread.execservice;

public class TestInterview {

	public static int foo(int a)
	{
		return a++ * ++a;
	}
	
	public static void main(String[] args) {
		int x=2;
		int y=2;
		for (int i=1; i <16; i++) {
			x=x*2;
		}
			
		System.out.println(x);
		char c = 127;
		c = (char) (c + 10);
		double a = 5/10*2.0;
		int d = 2 | 1;
		int e = 3^1;
		
		int f=1;
		switch(f)
		{
		case 0: f++;
		case 1: f=3;
		case 2: f++;
		}
		System.out.println((int)c + " " + a + " " + d + " " + e + " " + f + " " + foo(5));
		
	    int aa = 5;
	    int bb = aa >> 1;
		int cc = bb >> 2;
		System.out.println(Integer.toBinaryString(bb) + " " + Integer.toBinaryString(cc));
		
	}

}
