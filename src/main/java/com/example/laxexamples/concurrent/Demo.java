package com.example.laxexamples.concurrent;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListMap;

public class Demo {

	public static void main(String[] args) {
		ConcurrentSkipListMap<String,String> concurrentSkipListMap = new ConcurrentSkipListMap<String,String>();
	
		        concurrentSkipListMap.put("1111", "Tom Smith");
			        concurrentSkipListMap.put("2222","David Jones");
			        concurrentSkipListMap.put("3333", "Jim Anderson");
			        concurrentSkipListMap.put("4444", "John Abraham");
			        concurrentSkipListMap.put("5555", "Brad Pitt");
			         
			        System.out.println("The name associated with id 1111 is "+ concurrentSkipListMap.get("1111"));
			         
			        NavigableSet<String> navigableKeySet = concurrentSkipListMap.keySet();
			        System.out.println("The keys associated with this map are ");
			        for(Iterator iterator = navigableKeySet.iterator();iterator.hasNext();)
			        {
			  	                    System.out.println(iterator.next());
			   
			        }
	}

}
