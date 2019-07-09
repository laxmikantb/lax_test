package org.lax.java8;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SortedTest {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(3);
		al.add(19);
		al.add(25); 
		al.add(35); 
		al.add(14);
		System.out.println("Sorted array natural way  " + al.stream().sorted().collect(Collectors.toList()));
		System.out.println("Sorted array custom descend sort way  " + al.stream().sorted((a,b) -> -a.compareTo(b)).collect(Collectors.toList()));

	}

}
