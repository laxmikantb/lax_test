package com.example.laxexamples.iter;

public class Product {
	private String name;
	private int qtyInStock;
	
	/*
	 * 
	 */
	public Product(String name, int qty) {
		this.name = name;
		this.qtyInStock = qty;
	}
	
	public String getName()
	{
	   return name;
	}
	
	public int getQuantityInStock()
	{
	   return qtyInStock;
	}
	
	
}
