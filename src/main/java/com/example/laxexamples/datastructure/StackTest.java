package com.example.laxexamples.datastructure;

public class StackTest {
  int top;
  long[] intArr;
  int maxSize;
  
  public StackTest(int size)
  {
     intArr = new long[size];
     maxSize = size;
     top = -1;
  }
  
  public boolean isEmpty()
  {
	  return (top == -1);
  }
  
  public boolean push(int i)
  {
	  if (top == (maxSize-1))
		  return false;
	  intArr[++top] = i;
	  return true;
  }
  
  public long pop() {
	  		  return intArr[top--];
	 
  }
  
  public long peek() {
		  return intArr[top];

  }
  
  public boolean isFull()
  {
	  return top == (maxSize-1);
  }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackTest theStack = new StackTest(10); // make new stack
		theStack.push(20); // push items onto stack
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		
		while( !theStack.isEmpty() ) // until it’s empty,
		{ // delete item from stack
			long value = theStack.pop();
			System.out.print(value); // display it
			System.out.print(" ");
		} // end while
		System.out.println("");
	}

}
