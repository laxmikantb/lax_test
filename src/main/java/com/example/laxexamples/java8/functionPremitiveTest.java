package org.lax.java8;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class functionPremitiveTest {

	 public static void main(String[] args)
	 {
	 IntFunction<Integer> f=i->i*i;
	 System.out.println(f.apply(5));
	 
	 IntToDoubleFunction f1=i->Math.sqrt(i);
	 System.out.println(f1.applyAsDouble(9)); 
	 
	 ToIntFunction<String> f2=s->s.length();
	 System.out.println(f2.applyAsInt("durga")); 
	 
	} 
}
