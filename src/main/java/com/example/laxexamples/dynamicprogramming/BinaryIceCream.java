package com.example.laxexamples.dynamicprogramming;
import java.util.Arrays;
import java.util.HashMap;

public class BinaryIceCream {
	public static int[] getChoices(int[] menu, int money) {
		int[]  localmenu = menu.clone();
		Arrays.sort(localmenu);
		for (int i=0; i < localmenu.length; i++)
		{
			int choice = money - localmenu[i];
			int index = Arrays.binarySearch(localmenu, i + 1, localmenu.length, choice);
			if (index >= 0 && index < localmenu.length && localmenu[index] == choice) 
			{
				int[] indices = getIndicesFromValues(menu, localmenu[i], choice);
				return indices;
			}
		}
		return null;
	}
	
	private static int[] getIndicesFromValues(int[] menu, int value1, int value2) {
		int index1 = indexOf(menu, value1, -1);
		int index2 = indexOf(menu, value2, index1);
		int[] indices = { Math.min(index1,  index2), Math.max(index1,  index2) };
		return indices;
	}

	private static int indexOf(int[] menu, int value1, int exclude) {
		for (int i=0; i < menu.length; i++) {
			if (menu[i] == value1 && i != exclude) {
				return i;
			}
		}
		return -1;
	}
    public static void buyIceCream(int [] costs, int money) {
        HashMap<Integer, Integer> map = new HashMap<>(); // key = cost, value = ice cream ID
        for (int i = 0; i < costs.length; i++) {
            int icecreamID = i + 1;
            int cost       = costs[i];
            
            /* Find 2 flavors to buy that sum to "money" */
            int otherCost  = money - cost;
            if (map.containsKey(otherCost)) {
                System.out.println(map.get(otherCost) + " " + icecreamID);
            }
            
            map.putIfAbsent(cost, icecreamID);
        }
    }
    
	public static void main(String[] args) {
		
	}
}
