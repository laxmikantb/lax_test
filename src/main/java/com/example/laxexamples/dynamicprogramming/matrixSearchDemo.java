package com.example.laxexamples.dynamicprogramming;
import java.util.ArrayList;
import java.util.List;

public class matrixSearchDemo {

	public static boolean matrixSearch(List<List<Integer>> arr, int x) {
		int row =0, col = arr.get(0).size() -1; // start from top right
		while (row < arr.size() && col >=0) {
			if (arr.get(row).get(col).equals(x)) {
				return true;
			}
			else if (arr.get(row).get(col) < x) {
				++row;
			}
			else
				--col;
		}
		return false;
	}
	
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
        ArrayList<Integer> colList = new ArrayList<Integer>();
        colList.add(-1);
        colList.add(2);
        colList.add(4);
        colList.add(4);
        colList.add(6);
        list.add(colList);
        
        colList = new ArrayList<Integer>();
        colList.add(1);
        colList.add(5);
        colList.add(5);
        colList.add(9);
        colList.add(21);
        list.add(colList);
        
        colList = new ArrayList<Integer>();
        colList.add(3);
        colList.add(6);
        colList.add(6);
        colList.add(9);
        colList.add(22);
        list.add(colList);
        
        colList = new ArrayList<Integer>();
        colList.add(3);
        colList.add(6);
        colList.add(8);
        colList.add(10);
        colList.add(24);
        list.add(colList);
        
        colList = new ArrayList<Integer>();
        colList.add(6);
        colList.add(8);
        colList.add(9);
        colList.add(12);
        colList.add(25);
        list.add(colList);
        
       System.out.println(matrixSearch(list, 26));
	}

}
