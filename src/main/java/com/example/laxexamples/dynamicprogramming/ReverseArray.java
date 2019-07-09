package com.example.laxexamples.dynamicprogramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArray {
	public static void main(String[] args)
	{
		String hi = "Hello";
        
	}
	
	public static String reverseString(String hi) {
		
		if (hi != null || hi.length() > 0)
			return new StringBuilder(hi).reverse().toString();
		else 
			return hi;
   }
	
	public static void reverseString2()
	{
        String input="";
        System.out.println("Enter the input string");
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
            char[] try1= input.toCharArray();
            for (int i=try1.length-1;i>=0;i--)
            	System.out.print(try1[i]);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
	}
	public static String reverseWordByWord() {
			String s = "He is the one";
            if (s.isEmpty()) {
                return s;
            }
            String str[] = "He is the one".split(" ");
            String finalStr="";
                for(int i = str.length-1; i>= 0 ;i--){
                    finalStr += str[i]+" ";
                }
                System.out.println(finalStr);
            return finalStr;
	}
        
	public static char[] reverse(char[] buf, int start, int end) {
	    for (int i = start, j = end - 1; i < j; i++, j--) {
	        char swap = buf[i];
	        buf[i] = buf[j];
	        buf[j] = swap;
	    }
	    return buf;
	}
}
