package com.example.laxexamples.bit;
public class BitDemo {

	public static void main(String[] args) {
		int i = -1;
		i = i>> 1;
				System.out.println(i);
				 int x = 10, y = 5; 
				 System.out.println("x > y : "+x  + y);
			     System.out.println("x > y : "+(x > y)); 
			     System.out.println("x < y : "+(x < y)); 
			     System.out.println("x >= y : "+(x >= y)); 
			     System.out.println("x <= y : "+(x <= y)); 
			     System.out.println("x == y : "+(x == y));
			     System.out.println("x != y : "+(x != y)); 
			     boolean x1 = true;
					boolean y1 = false;
					System.out.println("x & y : " + (x1 & y1));
					System.out.println("x && y : " + (x1 && y1));
					System.out.println("x | y : " + (x1 | y1));
					System.out.println("x || y: " + (x1 || y1));
					System.out.println("x ^ y : " + (x1 ^ y1));
					System.out.println("!x : " + (!x1));
					
					boolean t1 = false ? false : true ? false : true ? false : true;
					boolean t2 = false ? false
							: (true ? false : (true ? false : true));
					boolean t3 = ((false ? false : true) ? false : true) ? false
							: true;
					System.out.println(m1(t1) + m1(t2) + m1(t3));
					
	}
	
	static String m1(boolean b) {
		return b ? "T" : "F";
	}
	
	

}
