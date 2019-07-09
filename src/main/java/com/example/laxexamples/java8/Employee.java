package org.lax.java8;

public class Employee {
	public int eno;
	public String name;
	public double dailwage;
	
	public Employee(int no, String name, double wage) {
		this.eno = no;
		this.name = name;
		this.dailwage = wage;
	}

	public String toString() {
		return "Name :" + name;
	}
}
