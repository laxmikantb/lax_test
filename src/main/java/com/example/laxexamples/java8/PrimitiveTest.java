package org.lax.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveTest {

	public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] dnumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // IntStream.of or Arrays.stream, same output
        List<Integer> list1 = IntStream.of(number).boxed().collect(Collectors.toList());
        List<Double> dlist1 = DoubleStream.of(dnumber).boxed().collect(Collectors.toList());

        
        List<Integer> list = Arrays.stream(number).boxed().collect(Collectors.toList());
        List<Double> dlist2 = Arrays.stream(dnumber).boxed().collect(Collectors.toList());
        System.out.println("list : " + list);
        System.out.println("list : " + dlist1);
        System.out.println("list : " + dlist2);


	}

}
