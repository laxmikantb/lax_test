package com.example.laxexamples.datastructure;

public class OrderedArray {

	private int nElems = 0;
	private int[] orderArr;
	
	/*
	 * TABLE 2.3 Comparisons Needed in Binary Search Logarithm
Range Comparisons Needed
10 4
100 7
1,000 10
10,000 14
100,000 17
1,000,000 20
10,000,000 24
100,000,000 27
1,000,000,000 30
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int maxSize = 100; // array size
		OrderedArray arr; // reference to array
		arr = new OrderedArray(maxSize); // create the array
		arr.insert(77); // insert 10 items
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		int searchKey = 55; // search for item
		if( arr.find(searchKey) != arr.size() )
			System.out.println("Found " + searchKey);
		else
			System.out.println("Can’t find " + searchKey);
		arr.display(); // display items
		arr.delete(00); // delete 3 items
		arr.delete(55);
		arr.delete(99);
		arr.display(); // display items again
	}
	
	public OrderedArray(int max) // constructor
	{
		orderArr = new int[max]; // create array
		nElems = 0;
	}
	//-----------------------------------------------------------
	public int size()
	{
		return nElems; 
	}
	//-----------------------------------------------------------
	/*
	 * Use Binary Search for find
	 * n/2+n/4+n/8....+n/k
	 * n/(2^k)
	 * n/2^k < 1 <= n/(2^(k-1))
	 * invert
	 * 2^k > n > 2^(k-1)
	 * equivalent to
	 * k > log2n > log2n +1
	 * thus o(log n)
	 */

	public int find(int searchKey)
	{
		int lowerBound = 0;
		int upperBound = nElems - 1;
		int curIndex;
		
		while (true)
		{
			curIndex = (lowerBound + upperBound) /2;
			if (orderArr[curIndex] == searchKey)
				return curIndex;
			if (lowerBound> upperBound)
			{
				return nElems; // can't find
			}
			//divide
			if (orderArr[curIndex] < searchKey)
			{
				lowerBound = curIndex + 1;
			}
			else
			{
				upperBound = curIndex - 1;
	     	}
		}
	}
	
	public void insert(int value) // put element into array
	{
		int j;
		for(j=0; j<nElems; j++) // find where it goes
			if	(orderArr[j] > value) // (linear search)
				break;
		for(int k=nElems; k>j; k--) // move bigger ones up
			orderArr[k] = orderArr[k-1];
		orderArr[j] = value; // insert it
		nElems++; // increment size
	} // end insert()
	//-----------------------------------------------------------
	public boolean delete(int value)
	{
	int j = find(value);
		if	(j==nElems) // can’t find it
				return false;
		else // found it
		{
			for(int k=j; k<nElems; k++) // move bigger ones down
				orderArr[k] = orderArr[k+1];
			nElems--; // decrement size
			return true;
		}
	} // end delete()
	
	//-----------------------------------------------------------
	public void display() // displays array contents
	{
		for(int j=0; j<nElems; j++) // for each element,
			System.out.print(orderArr[j] + " " ); // display it
			System.out.println(" ");
	}
	//-----------------------------------------------------------
    // end class OrdArray
	////////////////////////////////////////////////////////////////
}
