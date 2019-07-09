package com.example.laxexamples.Thread.execservice;

public class B extends A{
	public void print() {
		System.out.println("class B");
	}
	
	public static void main(String[] args) {
		A a = new B();
		a.print();
		int aa = 2;
		incr(aa);
		System.out.println(aa);
		Object o = null;
		try {
			System.err.println(o.toString());
		} catch (NullPointerException e ) { 
			System.err.println("Ex"); 
			}
		catch (Exception e ) { 
			System.err.println("Ex"); 
			}
		System.out.println("F = " + f() * f() * f() * f());
		int abc = 1;
		try {
			abc++; throw new Exception();
		} 
		catch (Exception e ) { 
			abc++; 
			System.out.println(" in Exception" + abc);
		}
		finally {
		 abc++;
		 System.out.println(abc);
		 
		}
	}

	static int n = 0;
	
	private static int f() {
		n= n -1;
		return n;
	}
	
	static void incr(int a) { a++; }
}
