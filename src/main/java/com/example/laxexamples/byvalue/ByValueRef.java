package com.example.laxexamples.byvalue;

public class ByValueRef {

	public static void main(String[] args) {
	    int[] toyNumber = new int[] {5};
	    ByValueRef temp = new ByValueRef();
	    temp.play(toyNumber);
	    System.out.println("Toy number in main " + toyNumber[0]);
	    int tNum = 10;
	    temp.play(tNum);
	    System.out.println("Toy number in main after byValue" + tNum);
	}

	void play(int[] toyNumber){
	    System.out.println("Toy number in play " + toyNumber[0]);
	    toyNumber[0]++;
	    System.out.println("Toy number in play after increement " + toyNumber[0]);
	}
	
	void play(int toyNumber){
	    System.out.println("Toy number in play int " + toyNumber);
	    toyNumber++;
	    System.out.println("Toy number in play after increement int " + toyNumber);
	}
}

/* Answer
Toy number in play 5
Toy number in play after increement 6
Toy number in main 6
Toy number in play int 10
Toy number in play after increement int 11
Toy number in main after byValue1
*/