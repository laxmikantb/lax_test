package org.lax.java8;

import java.util.function.BiPredicate;

public class BiPredicateTest {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bp = (a,b) -> (a+b)%2 ==0;
		System.out.println("Bi Predicate for 10, 3 sum check is " + bp.test(10,  3));
		System.out.println("Bi Predicate for 10, 2 sum check is " + bp.test(10,  2));
		//and, or, negate
	}

}
