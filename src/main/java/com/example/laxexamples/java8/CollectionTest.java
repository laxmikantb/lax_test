package org.lax.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionTest {

	public static void main(String[] args) {
		LinkedList<String> l;
		ArrayList<String> a;
		Vector v;

		TreeSet ss;
		HashSet hs; // based on hash
		LinkedHashMap lm;
		HashMap m;
		ConcurrentHashMap cm;
		TreeMap tm;
		NavigableMap nm;
		LinkedHashMap lhm;
		IdentityHashMap im;
		WeakHashMap wm;
		
        LinkedHashMap<String, String> lhm1 = 
                new LinkedHashMap<String, String>(); 
		 lhm1.put("one", "practice.geeksforgeeks.org"); 
		 lhm1.put("two", "code.geeksforgeeks.org"); 
		 lhm1.put("four", "quiz.geeksforgeeks.org");
		 lhm1.put("five", "quiz.geeksforgeeks.org"); 
		
		 // It prints the elements in same order  
		 // as they were inserted     
		 System.out.println(lhm1); 
		
		 System.out.println("Getting value for key 'one': " 
		                                + lhm1.get("one")); 
		 System.out.println("Size of the map: " + lhm1.size()); 
		 System.out.println("Is map empty? " + lhm1.isEmpty()); 
		 System.out.println("Contains key 'two'? "+  
		                           lhm1.containsKey("two")); 
		 System.out.println("Contains value 'practice.geeks"
		 +"forgeeks.org'? "+ lhm1.containsValue("practice"+ 
		 ".geeksforgeeks.org")); 
		 System.out.println("delete element 'one': " +  
		                    lhm1.remove("one")); 
		 System.out.println(lhm1);
		 
		 Set<Map.Entry<String, String>> entryset = lhm1.entrySet();
		 for (Entry enty: entryset) {
			 System.out.println(enty.getKey());
		 }
 
	        // Creating an empty IdentityHashMap 
	        IdentityHashMap<Integer, String> identity_hash =  
	                      new IdentityHashMap<Integer, String>(); 
	  
	        // Mapping string values to int keys 
	        identity_hash.put(10, "Geeks"); 
	        identity_hash.put(15, "4"); 
	        identity_hash.put(20, "Geeks"); 
	        identity_hash.put(25, "Welcomes"); 
	        identity_hash.put(30, "You"); 
	  
	        // Displaying the IdentityHashMap 
	        System.out.println("Initial Mappings are: " +  
	                                             identity_hash); 
	  
	        // Using entrySet() to get the set view 
	        System.out.println("The set is: " +  
	                                   identity_hash.entrySet()); 
	        
		ArrayList<String> al = new ArrayList<String>(); 
		al.add("Sunny"); 
		al.add("Bunny"); 
		al.add("Chinny"); 
		al.add("Sunny"); 
		System.out.println(al);
		
		Collections.sort(al); // natural order sort
		System.out.println(al);
		Collections.sort(al, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				String os1 = (String) o1;
				String os2 = (String) o2;
				if (os1.length() < os2.length())
					return -1;
				if (os1.length() > os2.length())
					return 1;
				return 0;

			}
			
		}); // customised order sort
		System.out.println(al);
		
		// usimg lambda descend
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(10);
		l2.add(0);
		l2.add(15);
		l2.add(5);
		l2.add(20);
		System.out.println("Before Sorting:" + l2);
		Collections.sort(l2, (I1, I2) -> (I1 < I2) ? 1 : (I1 > I2) ? -1 : 0);
		System.out.println("After Sorting:" + l2);
		
		ArrayList<Employee> el= new ArrayList<Employee>();
		el.add(new Employee(100,"Katrina",10)); 
		el.add(new Employee(600,"Kareena",10));
		el.add(new Employee(200,"Deepika",10)); 
		el.add(new Employee(400,"Sunny",10)); 
		el.add(new Employee(500,"Alia",10)); 
		el.add(new Employee(300,"Mallika",10)); 
		System.out.println("Before Sorting:"); 
		System.out.println(el); 
		Collections.sort(el,(e1,e2)->(e1.eno < e2.eno)?-1:(e1.eno>e2.eno)?1:0); 
		System.out.println("After Sorting:"); 
		System.out.println(el); 
		
		
		
	}

}
