package com.example.laxexamples.datastructure;

public class DemoArray {

      private long[] a; // reference array
	  private int nElems; // number of data items
		
		  public DemoArray(int max){
			  a = new long[max];
			  nElems = 0;
		  }
		  
		  public void insert(long value)
		  {
		     a[nElems] = value;
		     nElems++;
		  }
		  
		  public void display()
		  {
		    for (int i=0; i < nElems; i++)
		    {
		       System.out.print(a[i] + " ");	
		    }
		    System.out.println("");
		  }
		  
		  public void bubbleSort()
		  {
			  int out, in;
			  
			  for (out=nElems-1; out >1; out--)
			  {
				  for (in=0; in < out; in++)
				  {
					  if (a[in] > a[in+1]){
						  swap(in,in+1);
					  }
				  }
			  }
		  }
		  
		  public void selectionSort()
		  {
			  int out, in;
			  int min;
			  
			  for (out=0; out < nElems; out++)
			  {
				  min = out;
				  for (in=out+1; in < nElems; in++)
				  {
					  if (a[in] < a[min])
						  min = in;
				  }
				  swap(out, min);
			  }
		  }
		  
		//--------------------------------------------------------------
		  public void insertionSort()
		  {
			  int in, out;
			  for(out=1; out<nElems; out++) // out is dividing line
			  {
				  long temp = a[out]; // remove marked item
				  in = out; // start shifts at out
				  while(in>0 && a[in-1] >= temp) // until one is smaller,
				  {
					  	a[in] = a[in-1]; // shift item to right
					  	--in; // go left one position
				  }
				  a[in] = temp; // insert marked item
			  } // end for
		  } // end insertionSort()
		  
		  
		  //--------------------------------------------------------------
		  
		  private void swap(int one, int two)
		  {
			  long temp = a[one];
			  a[one] = a[two];
			  a[two] = temp;
		  }
		  
		  public void shellSort()
		  {
			  int inner, outer;
			  long temp;
			  int h = 1; // find initial value of h
			  while(h <= nElems/3)
				  h = h*3 + 1; // (1, 4, 13, 40, 121, ...)
			  while(h>0) // decreasing h, until h=1
			  {
				  // h-sort the file
				  for(outer=h; outer<nElems; outer++)
				  {
					  temp = a[outer];
					  inner = outer;
					  // one subpass (eg 0, 4, 8)
					  while(inner > h-1 && a[inner-h] >= temp)
					  {
						  a[inner] = a[inner-h];
						  inner -= h;
					  }
					  a[inner] = temp;
				  } // end for
				  h = (h-1) / 3; // decrease h
			  } // end while(h>0)
		  } // end shellSort()
		  //--------------------------------------------------------------

		  public void quickSort()
		  {
			  recQuickSort(0, nElems-1);
		  }
		  
		  public void recQuickSort(int left, int right)
		  {
			  if	(right-left <= 0) // if size <= 1,
				  return; // already sorted
			  else // size is 2 or larger
			  {
				  long pivot = a[right]; // rightmost item
				  // partition range
				  int partition = partitionIt(left, right, pivot);
				  recQuickSort(left, partition-1); // sort left side
				  recQuickSort(partition+1, right); // sort right side
			  }
		  } // end recQuickSort()
		  //--------------------------------------------------------------
		  
		  public int partitionIt(int left, int right, long pivot)
		  {
			  int leftPtr = left-1; // left (after ++)
			  int rightPtr = right; // right-1 (after --)
			  while(true)
			  { // find bigger item
				  while( a[++leftPtr] < pivot )	  ; // (nop)
				  // find smaller item
				  while(rightPtr > 0 && a[--rightPtr] > pivot) 		  ; // (nop)
				  if (leftPtr >= rightPtr) // if pointers cross,
					  break; // partition done
				  else // not crossed, so
					  swap(leftPtr, rightPtr); // swap elements
			  } // end while(true)
			  swap(leftPtr, right); // restore pivot
			  return leftPtr; // return pivot location
		  } // end partitionIt()
}
