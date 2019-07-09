package org.lax.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class java8 {

	public void m1(String name) {
		name = "anana" + name;
		Runnable r = () -> { try { Thread.sleep(100); } catch (Exception e) {}; System.out.println("ANCC" + name ); };
		
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		new java8().m1();
		
		Predicate<Integer> p = i->i%10 ==0;
		System.out.println(p.test(10));
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		int j = (int) strings.stream().count();
		System
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println(filtered);
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
	
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		System.out.println(squaresList);
		
		List<String> strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

		//get count of empty string
		int count = (int) strings2.stream().filter(string -> string.isEmpty()).count();
		
		Random random2 = new Random();
		random2.ints().limit(10).sorted().forEach(System.out::println);
		
	}
}
