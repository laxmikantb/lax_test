package com.example.laxexamples.iter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestFilter {

	/*
	 * Filter criteria
	 */
	public static final Filter<Product> IN_STOCK =
			   new Filter<Product>() {
			     public boolean passes(Product product) {
			       return product.getQuantityInStock() > 100;
			     }
			   };
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<Product> allProducts = getAllProducts();
		for(Product product : IN_STOCK.filter(allProducts)) {
			display(product);
		}
	}
	
	/*
	 * 
	 */
	public static Collection<Product> getAllProducts()
	{
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product("Product1", 100));
		products.add(new Product("Product2", 120));
		products.add(new Product("Product3", 100));
		products.add(new Product("Product4", 150));
		products.add(new Product("Product5", 100));
		products.add(new Product("Product6", 170));
		
		return products;
	}
	
	public static void display(Product product) {
       System.out.println(product.getName() + " " + product.getQuantityInStock());
	}

}
