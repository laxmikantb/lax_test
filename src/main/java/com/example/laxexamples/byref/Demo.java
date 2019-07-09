package com.example.laxexamples.byref;

public class Demo {

	String name;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
         
		Class1 c1 = new Class1();     
		c1.displayStrings();    

		Demo d = new Demo("Max");
		d.foo(d);
		System.out.println(d.name + " " + d.name.equals("Fifi"));
		
        TigerCat myCat = new TigerCat();
        myCat.testClassMethod();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
	}
	
	public Demo(String name)
	{
		this.name = name;
	}
	
	public void foo(Demo d)
	{
		  d.name.equals("Max"); // true
		  d.name = "abc";
		  d = new Demo("Fifi");
		  System.out.println(d.name.equals("Fifi")); // 
	}
	
}
