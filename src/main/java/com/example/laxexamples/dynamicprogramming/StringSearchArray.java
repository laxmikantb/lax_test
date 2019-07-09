package com.example.laxexamples.dynamicprogramming;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class StringSearchArray {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> searchList = new ArrayList<String>();;
	    Scanner scan = new Scanner(System.in); 
        int numberOfElements = scan.nextInt();;
        for (int i=0; i < numberOfElements; i++) {
        	list.add(scan.next());
        }
        int numberOfSearches= scan.nextInt();;
        for (int i=0; i < numberOfSearches; i++) {
        	searchList.add(scan.next());
        }
        
        ArrayList<Integer> countList = new ArrayList<Integer>();
		Collections.sort(list);
		for (int i=0; i < numberOfSearches; i++) {
			String searchString = searchList.get(i);
			int count = 0;
			for (int j=0; j < numberOfElements; j++)
			{
				if (list.get(j).equals(searchString)) count++;
			}
			
			countList.add(count);
		}
		for (int i=0; i< countList.size(); i++) {
			System.out.println(countList.get(i));
		}
	}
}
