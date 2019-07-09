package com.example.laxexamples;

public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrInt = new int[] { 1, 4,5,6,6,6,6,67,8,8};
		Object[] objArr = new Object[10];
		objArr[0] = new Student();
		objArr[1] = new Demo();
		Student[] sArr = new Student[3];
		sArr[0] = new Student();
		//sArr[1]= new Demo();
	}

}

class Student {

}

class Demo {
	
}
