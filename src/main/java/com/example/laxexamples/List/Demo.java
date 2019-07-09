package com.example.laxexamples.List;

import java.util.HashMap;

public class Demo {
	public static void main(String[] args) {
		int[] numbers = { 2,3, 4, 8, 5 };
		int target = 7;
		int[] result = new Demo().twoSumTarget(numbers, target);
		System.out.println(result[0] + " " +  result[1]);
	}


	public int[] twoSumTarget(int[] numbers, int target) 
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for ( int i=0; i < numbers.length;  i++) {
			Integer diff = target - numbers[i];
			if (map.containsKey(diff)) {
				int values[] = { diff.intValue(), numbers[i] };
				return values;
			}
			map.put(numbers[i], numbers[i]);
		}
		return null;
		
	}
}
