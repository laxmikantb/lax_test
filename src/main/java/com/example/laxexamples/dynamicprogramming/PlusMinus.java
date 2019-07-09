package com.example.laxexamples.dynamicprogramming;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<List> list = new ArrayList<List>(3);
		for (int i=0; i < 3; i++) {
			list.add(new ArrayList<Integer>());
		}
		int numberOfElements = in.nextInt();
		for (int i=0; i < numberOfElements; i++) {
			int number = in.nextInt();
			if (number > 0) list.get(0).add(number);
			if (number < 0) list.get(1).add(number);
			if (number ==0 ) list.get(2).add(number);
			
		}
		for (int i=0; i < 3; i++)
			System.out.println(list.get(i).size() * 1.0/numberOfElements);
	}

}
