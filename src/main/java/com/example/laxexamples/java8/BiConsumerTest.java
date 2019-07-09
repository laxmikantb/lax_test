package org.lax.java8;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class BiConsumerTest {

	static class Employee {
		String name;
		double salary;

		Employee(String name, double salary) {
			this.name = name;
			this.salary = salary;
		}
	}

	public static void main(String[] args) {
		BiConsumer<String, String> c = (s1, s2) -> System.out.println(s1 + s2);
		c.accept("durga", "soft");

		ArrayList<Employee> l = new ArrayList<Employee>();
		populate(l);
		BiConsumer<Employee, Double> c2 = (e, d) -> e.salary = e.salary + d;
		for (Employee e : l) {
			c2.accept(e, 500.0);
		}
		for (Employee e : l) {
			System.out.println("Employee Name:" + e.name);
			System.out.println("Employee Salary:" + e.salary);
			System.out.println();
		}
	}

	public static void populate(ArrayList<Employee> l) {
		l.add(new Employee("Durga", 1000));
		l.add(new Employee("Sunny", 2000));
		l.add(new Employee("Bunny", 3000));
		l.add(new Employee("Chinny", 4000));
	}
}