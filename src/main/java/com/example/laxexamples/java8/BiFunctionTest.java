package org.lax.java8;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionTest {

	public static void main(String[] args) {
		BiFunction<Integer, String, String> bf = (a, b) -> a + b;
		System.out.println(bf.apply(10," LAX"));
		// create student object using name and mark
		ArrayList<Student> al = new ArrayList<Student>();
		BiFunction<String, Integer, Student> bf2 = (s, m) -> new Student(s, m);
		al.add(bf2.apply("Lax", 50));
		al.add(bf2.apply("Durga", 100));
		System.out.println(al);
		
		// calculate month salary using employee and timesheet
		
		BiFunction<Employee, Timesheet, Double> bf3 = (e, t) -> e.dailwage * t.days;
		Employee e = new Employee(1, "Lax", 400.00);
		Timesheet t = new Timesheet(1, 22);
		System.out.println("Montly Salary is " + bf3.apply(e,  t));
		
	}

}
