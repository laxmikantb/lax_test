package com.example.laxexamples;

import java.util.ArrayList;


public class FindMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] darr = { 10.0, -0.9, 13, 17,345,-789, 16, 20, 3567, -6789 };
		
		double lowest = darr[0];
        for (int i =0; i < darr.length; i++) {
        	if  (lowest > darr[i])
        	{
        		lowest = darr[i];
        	}
        }
        System.out.println("Min number is " + lowest);
        
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(-789);
        list.add(2000);
        list.add(1000);
        
        lowest = (double) list.get(0);
        for (int i=0; i <  list.size() ; i++)
        {
        	if (lowest > (double) list.get(i)) {
        		lowest = (double) list.get(i);
        	}
        }
        System.out.println("Min number is " + lowest);	       
	}

}
