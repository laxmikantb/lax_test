package com.example.laxexamples.dynamicprogramming;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level){
		this.level = level;
	}
	@Override
	protected void write(String message) {
		System.out.println("In Console Logger " + message);
		
	}
}
