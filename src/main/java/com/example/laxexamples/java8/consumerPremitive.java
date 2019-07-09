package org.lax.java8;

import java.util.function.IntConsumer;
import java.util.function.ObjDoubleConsumer;

public class consumerPremitive {
	class Employee {
		String name;
		double salary;

		Employee(String name, double salary) {
			this.name = name;
			this.salary = salary;
		}
	}

	public static void main(String[] args) {
		IntConsumer c = i -> System.out.println("The Square of i:" + (i * i));
		c.accept(10);

		ObjDoubleConsumer<Employee> c1 = (e, d) -> e.salary = e.salary + d;
	}
}
