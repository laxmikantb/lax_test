package org.lax.java8;

import java.util.function.DoublePredicate;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.LongPredicate;
import java.util.function.ToIntFunction;

public class IntPredicateTest {

	public static void main(String[] args) {
		IntPredicate ip = i -> i %2 ==0;
		int[] x = { 0, 2, 5, 7,6,9,8 };
		for (int x1 : x ) {
			if (ip.test(x1))
				System.out.println("Even Number "  + x1);
		}
		
		LongPredicate lp = i -> i %2 ==0;
		long[] l = { 0, 2, 5, 7,6,9,8 };
		for (long x1 : l ) {
			if (lp.test(x1))
				System.out.println("Long Even Number "  + x1);
		}
		
		DoublePredicate dp = i -> i % 2 == 0;
		double[] d = { 0, 2, 5, 7,6,9,8 };
		for (double x1 : d ) {
			if (dp.test(x1))
				System.out.println("Double Even Number "  + x1);
		}

		IntFunction ifun = i -> i * i;
		System.out.println("IntFunction square Number "  + ifun.apply(19));
		IntFunction<Integer> ifun2 = i -> i * i;
		System.out.println("IntFunction Integer Returns square Number "  + ifun2.apply(19));

		ToIntFunction<String> intto = s -> s.length();
		System.out.println("ToIntFunction return int type " + intto.applyAsInt("Durga"));
		
	     IntToDoubleFunction tdouble = s -> Math.sqrt(s);
	     System.out.println("Sqlrt using IntToDouble " + tdouble.applyAsDouble(100));
	}

}
