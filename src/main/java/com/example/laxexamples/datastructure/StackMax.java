package com.example.laxexamples.datastructure;

import java.util.Stack;


public class StackMax {

	Stack<Integer> s= new Stack<Integer>();
	
	public int largestRectangleArea(int[] height) {
		int max = 0;
		int i = 0;
		while (i < height.length)
		{
			if (s.isEmpty() || (height[i] >= s.peek()))
			{
				s.push(height[i]);
				max = height[i];
				i++;
			}
			else {
				int count = 0;
				while (!s.isEmpty() && s.peek() > height[i])
				{
					count++;
					int top = s.pop();
					max = Math.max(max, top);
					//s.push(item);
				}
				for (int j=0; j < count+1; ++j) {
					s.push(height[i]);
				}
				i++;
			}
		}
		
        int count = 0;
        while(!s.isEmpty()) {
            count++;
            max = Math.max(max, s.pop() * count);
        }
        return max;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
