package com.example.laxexamples.dynamicprogramming;

public class GenericDemo {
   static class Gen<T> {
	   T obj;
	   Gen(T ob) {
		   this.obj = ob;
	   }
	   
	   public void show() {
		   System.out.println("The type of ob is " + obj.getClass().getName());
	   }
	   public T getObj()
	   {
		   return obj;
	   }
   }
   
   public static void main(String[] args ){
	   Gen<String> g1 = new Gen<String>("Durga");
	   g1.show();
	   System.out.println(g1.getObj());
	   
	   Gen<Integer> g2 = new Gen<Integer>(10);
	   g2.show();
	   System.out.println(g2.getObj());
	   
	   Gen<Double> g3 = new Gen<Double>(10.0);
	   g3.show();
	   System.out.println(g3.getObj());
	   
   }
}
