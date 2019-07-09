package com.example.laxexamples.byref;

public class Test {
	public static void main(String[] args)
	{
		Integer i = new Integer(0);
		add(i);
		System.out.println(i);
		
		String a = "Hello World";
		String b = "Hello World";
		System.out.println(a.equals(b));
		System.out.println(a==b);
		System.out.println(a==b.intern());
	}
	
	public static void add(Integer i)
	{
		int val = i.intValue();
		val+=3;
		i = new Integer(val);
	}
}