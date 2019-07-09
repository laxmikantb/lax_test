package org.lax.java8;

import java.util.Arrays;


import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;


public class StringJoinTest {
	public static void main(String[] args) {
		String joinedString = String.join(", ", "How", "To", "Do", "In", "Java");
		System.out.println(joinedString);
		
		List<String> strList = Arrays.asList("How", "To", "Do", "In", "Java");
        
		String joined1String = String.join(", ", strList);
		 
		System.out.println(joined1String);
		
		StringJoiner joiner = new StringJoiner(", ", "[", "]");
		 
		joiner.add("How")
		        .add("To")
		        .add("Do")
		        .add("In")
		        .add("Java");
		
		List<String> numbers = Arrays.asList("How", "To", "Do", "In", "Java");
		 
		String joined2String =   numbers
		                        .stream()
		                        .collect(Collectors.joining(", ","[","]"));
		 
		System.out.println(joined2String);
		
	}
}
