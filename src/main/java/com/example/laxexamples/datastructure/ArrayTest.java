package com.example.laxexamples.datastructure;

public class ArrayTest {
	int[] arr = new int[100];
	// insert is fast o(1)
	// search is setp thru o(n)
	// delete is o(n)
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = new int[100];
		   for (int i=0; i < arr2.length; i++)
		   {
			   System.out.println("main value at " + arr2[i] + " index " + i);
		   }
		new ArrayTest().printArr();
	}
	
	public void printArr()
	{
	   for (int i=0; i < arr.length; i++)
	   {
		   System.out.println("value at " + arr[i] + " index " + i);
	   }
	}
	
	void searchElement(int value) // o(n)
	{
		   for (int i=0; i < arr.length; i++)
		   {
			   if (arr[i] == value)
				   {
				   	System.out.println("value found at " + arr[i] + " index " + i);
				   }   
		   }
	}

}
