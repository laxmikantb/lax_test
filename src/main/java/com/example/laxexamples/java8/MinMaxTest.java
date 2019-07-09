package org.lax.java8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MinMaxTest {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(3);
		al.add(19);
		al.add(25); 
		al.add(35); 
		al.add(14);

		System.out.println("Sorted array custom min value   " + al.stream().min((a,b) -> a.compareTo(b)).get());
		System.out.println("Sorted array custom max value  " + al.stream().max((a,b) -> a.compareTo(b)).get());
		al.stream().forEach(i -> System.out.println(i*2));
		// toArray
		Integer[] ar = al.stream().toArray(Integer[]::new);
		for (Integer I : ar) {
			System.out.println(I);
		}
		Stream s = Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);
		
		Double[] doubls = {10.1, 10.2, 10.3,  10.4 };
		Stream<Double> ds = Stream.of(doubls);
		ds.forEach(System.out::println);
	}
}
