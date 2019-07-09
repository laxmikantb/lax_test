package com.example.laxexamples;

public class ArmstrongNumberdemo {

	public static void main(String[] args) {
		// Armstrong Number in Java: Armstrong number is a number that is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc
		
/*
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)  
where:  
(1*1*1)=1  
(5*5*5)=125  
(3*3*3)=27  
So:  
1+125+27=153  
 */
		int c=0,temp,a;
		int n =153;
		temp=n;
		while (n>0)
		{
			a=n%10;
			c=c+ (a*a*a);
			n=n/10;
		}
		if (temp == c)
		{
			System.out.println("it is armstring number");
		}
		else
		{
			System.out.println("it is not armstrong number");
		}
	}

}
