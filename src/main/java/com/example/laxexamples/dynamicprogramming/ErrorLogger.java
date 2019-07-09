package com.example.laxexamples.dynamicprogramming;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level){
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("In ErrorLogger  " + message);
		
	}
}