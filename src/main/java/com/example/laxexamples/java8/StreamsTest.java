package org.lax.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(15);
		l.add(25);
		
		System.out.println(l);
		
		ArrayList al2 = (ArrayList) l.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(al2);
		
		ArrayList al3 = (ArrayList)  l.stream().map(i -> i *2).collect(Collectors.toList());
		System.out.println(al3);
		
		long count =  l.stream().filter(i -> i%2 == 0).count();
		System.out.println("Count is " + count);
		
		
		List<Item> list = new ArrayList<>();
		list.add(new Item("code1", "name1"));
		list.add(new Item("code2", "name2"));

		Map<String,Item> map = list.stream()
		     .collect(Collectors.toMap(Item::getCode, Function.identity())); //Item::getName));
		
		System.out.println(map);
		
		ArrayList al4 = (ArrayList) l.stream().sorted().collect(Collectors.toList());
		System.out.println(al4);
		
		ArrayList al5 = (ArrayList) l.stream().sorted((i,j) -> (i > j) ? -1 : (i < j) ? 1 : 0).collect(Collectors.toList());
		System.out.println(al5);
		
		Integer min =  l.stream().min((i,j) -> i.compareTo(j)).get();
		System.out.println(min);
		
		Integer max =  l.stream().max((i,j) -> i.compareTo(j)).get();
		System.out.println(max);
		
		l.stream().forEach(i -> System.out.println(i));
		
		l.stream().forEach(System.out::println);
		
		// toArray
		Integer[] array = l.stream().toArray(Integer[]::new);
		System.out.println();
		for (Integer x: array) 
					System.out.print(x + " ");
		
		Double[] d = { 10.0, 11.4, 12.3, 14.9 };
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] dnumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // IntStream.of or Arrays.stream, same output
        List<Integer> list1 = IntStream.of(number).boxed().collect(Collectors.toList());
        List<Double> dlist1 = DoubleStream.of(dnumber).boxed().collect(Collectors.toList());

        
        List<Integer> nlist = Arrays.stream(number).boxed().collect(Collectors.toList());
        List<Double> dlist2 = Arrays.stream(dnumber).boxed().collect(Collectors.toList());
        System.out.println("list : " + nlist);
        System.out.println("list : " + dlist1);
        System.out.println("list : " + dlist2);
        
        Stream<Integer> s2 = Stream.of(9,99,999,99999,999999);
        s2.forEach(System.out::println);
        
        Stream<Double> s3 = Stream.of(d);
        s3.forEach(System.out::println);
		
	}

}
