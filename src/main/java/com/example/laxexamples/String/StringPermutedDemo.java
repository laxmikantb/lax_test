package com.example.laxexamples.String;

import java.util.Arrays;


public class StringPermutedDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str  = "This ismy String from Book jlsjhsdjkhsjk";
		String str2 = "jlsjhom Book Thisdjkhsjkfrs ismy String ";
		
		System.out.println(isPermuted(str, str2));
		
	}
	public static String sort(String s)
	{
		char[] conten = s.toCharArray();
		Arrays.sort(conten);
		return new  String(conten);
		
	}
	
	public static boolean isPermuted(String str, String str2)
	{
		if (str.length() !=str2.length())
		{
			return false;
		}
		
		return sort(str).equals(sort(str2));
	}

}
