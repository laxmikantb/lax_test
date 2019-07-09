package org.lax.java8;

import java.util.function.IntSupplier;

public class supplierPrimitive {
	public static void main(String[] args) {
		IntSupplier s=()->(int)(Math.random()*10); 
		String otp="";
	    for(int i =0;i<6;i++)
		{
		 otp=otp+s.getAsInt();
		 }
		 System.out.println("The 6 digit OTP: "+otp); 
	}
}
