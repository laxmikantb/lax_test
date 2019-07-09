package org.lax.java8;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

	public static void main(String[] args) {
		UnaryOperator<Integer> o = i -> i *i;
		System.out.println("UnaryOperator return same as input type " + o.apply(10));
		IntUnaryOperator ou = i -> i * i;
		System.out.println("IntUnaryOperator return int same as input int type  " + ou.applyAsInt(10));
		LongUnaryOperator lou = i -> i * i;
		DoubleUnaryOperator dou = i -> i * i;
		
		System.out.println("LongUnaryOperator return long same as input long type  " + lou.applyAsLong(10));
		System.out.println("DoubleUnaryOperator return double same as input double type  " + dou.applyAsDouble(10.0));

		IntUnaryOperator f=i->i*i;
		System.out.println(f.applyAsInt(6)); 
		
	}

}
