package org.lax.java8;

import java.util.function.Function;

public class Functiontest {
	
	public static void main(String[] args) {
		// Lambda function api
		Function<String, Integer> f = s-> s.length();
		System.out.println("Strlen using function " + f.apply("Durga"));
		
		Function<Integer, Integer> fn2 = i -> i * i;
		System.out.println("Square using function " + fn2.apply(10));
		
		// return number of spaces
		Function<String, Integer> fn3 = s -> s.length() - s.replaceAll(" ",  "").length();
		System.out.println("Number of spaces " + fn3.apply(" Same as be fore 123 "));
		
		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String,String> f2 = s-> s.substring(0,3);
		Function<String,String> f4 = s-> s.substring(0,7);
		
		System.out.println(f1.apply("Aishwariya"));
		System.out.println(f2.apply("Aishwariya"));
		
		System.out.println(f1.andThen(f2).apply("Aishwariya"));
		
		System.out.println(f1.compose(f4).apply("Aishwariya"));
		
		Function<Integer, Integer> f3 = i -> { return i % 2 == 0 ? i : i * i; }; 
		System.out.println(f3.apply(2));
		System.out.println(f3.apply(3));
		
		Function<String, String> fi = Function.identity();
		System.out.println(fi.apply("Durga"));
	}

}
