package org.lax.java8;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
		Supplier<String> s1 = () -> {
			String[] sl = {"Sunny", "Binny", "Chinney", "Vinny" };
			int x = (int) (Math.random()* 4);
			return sl[x];
		};
		for (int i =0; i < 10; i++)
			System.out.println(s1.get());
		
		// 6 digit OTP generate
		Supplier<String> sup = () -> {
			String otp = "";
			for (int i=0; i < 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		for (int i=0; i< 10; i++)
			System.out.println(sup.get());
		
		// generate random password
		// 2,4,6,8 - digit
		// 1,3,5,7 A-Z upper and @#S
		
		Supplier<String> pwdg = () ->
		{
			String pwd = "";
			Supplier<Integer> d = () -> (int) (Math.random() * 10);
			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Character> c = () ->
			{
				return symbols.charAt((int) (Math.random() * 29));
			};
			for (int i=0; i < 4; i++)
				pwd = pwd + d.get() + c.get();
			return pwd;
		};
		for (int i=0; i < 14; i++)
		System.out.println("Generated Password " + pwdg.get());
	}

}
