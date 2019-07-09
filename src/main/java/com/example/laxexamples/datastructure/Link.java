package com.example.laxexamples.datastructure;

public class Link {

	public int iData; // data item
	public double dData; // data item
	public Link next; // next link in list
	// -------------------------------------------------------------
	
	public Link(int id, double dd) // constructor
	{
		iData = id; // initialize data
		dData = dd; // (‘next’ is automatically
	}
	
	public void displayLink() // display ourself
	{
		System.out.print("{" + iData + ", " + dData + "} ");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
