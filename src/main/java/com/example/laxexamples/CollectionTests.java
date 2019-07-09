import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionTests tests = new CollectionTests();
		tests.TreeMapTest();
		// tests.ArrayListTest();
		// tests.LinkedListTest();
		// tests.HashMapTest();
		// tests.ArraysTest();
	}

	private static void printArray(String message, int array[]) {
		System.out.println(message + ": [length: " + array.length + "]");
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}

	private static HashMap sortByValues(HashMap map) {
		List list = new LinkedList(map.entrySet());
		// Defined Custom Comparator here
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) o1).getValue()).compareTo(((Map.Entry) o2).getValue());
			}
		});

		// Here I am copying the sorted list in HashMap
		// using LinkedHashMap to preserve the insertion order
		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}

	public void ArrayListTest() {
		ArrayList obj = new ArrayList<String>();
		obj.add("Ajit");
		obj.add("Harry");
		obj.add("Ajit");
		obj.add("Harry");
		obj.add("Chaitanya");
		obj.add("Steve");
		obj.add("Anuj");

		/* Displaying array list elements */
		System.out.println("Currently the array list has following elements:" + obj);

		/* Add element at the given index */
		obj.add(0, "Rahul");
		obj.add(1, "Justin");

		/* Remove elements from array list like this */
		obj.remove("Chaitanya");
		obj.remove("Harry");

		System.out.println("Current array list is:" + obj);

		/* Remove element from the given index */
		obj.remove(1);
		ArrayList obj2 = new ArrayList<String>();
		obj2.add("Ajit");
		obj2.add("Harry");
		obj.retainAll(obj2);
		Iterator ie = obj.iterator();
		Predicate<String> s = (i) -> i.equals("Ajit");
		List<String> pList = (List<String>) obj.stream().filter(s).collect(Collectors.toList());
		while (ie.hasNext()) {

			System.out.println(ie.next());
		}
		System.out.println("Current array list is:" + obj + " " + obj2 + " " + pList);
	}

	public void ArraysTest() {
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Arrays.sort(array);
		printArray("Sorted array", array);

		int index = Arrays.binarySearch(array, 2);
		System.out.println("Found 2 @ " + index);

		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 1, 2, 3 };

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Same");
		} else {
			System.out.println("Not same");
		}

		String a[] = { "A", "E", "I" };
		String b[] = { "O", "U" };
		List list = new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));

		list.retainAll(Arrays.asList(b));
		c = list.toArray();
		System.out.println(Arrays.toString(c));

		list.removeAll(Arrays.asList(b));
		c = list.toArray();
		System.out.println(Arrays.toString(c));
		Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5 };
		int min = Collections.min(Arrays.asList(numbers));
		int max = Collections.max(Arrays.asList(numbers));

		System.out.println("Min number: " + min);
		System.out.println("Max number: " + max);

		int[] ary = { 1, 2, 3, 4, 5, 6 };
		int[] ary1 = { 1, 2, 3, 4, 5, 6 };
		int[] ary2 = { 1, 2, 3, 4 };

		System.out.println("Is array 1 equal to array 2?? " + Arrays.equals(ary, ary1));
		System.out.println("Is array 1 equal to array 3?? " + Arrays.equals(ary, ary2));

		String[] coins = { "Penny", "nickel", "dime", "Quarter", "dollar" };
		Set set = new TreeSet();

		for (String coin : coins) {
			set.add(coin);
		}
		System.out.println(Collections.min(set));
		System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));

		for (int i = 0; i <= 10; i++) {
			System.out.print('-');
		}
		System.out.println(Collections.max(set));
		System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));

		List stuff = Arrays.asList(new String[] { "a", "b" });
		list = new ArrayList(stuff);
		list = Collections.unmodifiableList(list);
		try {
			list.set(0, "new value");
		} catch (UnsupportedOperationException e) {
		}
		set = new HashSet(stuff);
		set = Collections.unmodifiableSet(set);
		Map map = new HashMap();
		map = Collections.unmodifiableMap(map);
		System.out.println("Collection is read-only now.");

		ArrayList<String> obj = new ArrayList<String>();
		obj.add("A");
		obj.add("E");
		obj.add("I");
		obj.add("O");
		obj.add("U");
		Collections.shuffle(obj);
		System.out.println(obj);

		list = Arrays.asList("one Two three Four five six".split(" "));
		System.out.println("List :" + list);
		Collections.rotate(list, 3);

		Collections.rotate(list, -3);
		System.out.println("rotate -3: " + list);

	}

	public void HashMapTest() {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		/* Adding elements to HashMap */
		hmap.put(12, "Chaitanya");
		hmap.put(2, "Rahul");
		hmap.put(7, "Singh");
		hmap.put(49, "Ajeet");
		hmap.put(3, "Anuj");
		hmap.put(8, "Anuj");
		hmap.put(9, "Anuj");

		/* Display content using Iterator */
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}

		/* Get values based on key */
		String var = hmap.get(2);
		System.out.println("Value at index 2 is: " + var);

		/* Remove values based on key */
		var = hmap.remove(3);
		System.out.println("Removed Value and index 3 is: " + var);
		iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}

		Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
		System.out.println("After Sorting:");
		Set set2 = map.entrySet();
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry me2 = (Map.Entry) iterator2.next();
			System.out.print(me2.getKey() + ": ");
			System.out.println(me2.getValue());
		}

		Map<Integer, String> valuesmap = sortByValues(hmap);
		System.out.println("After Value Sorting:");
		Set set3 = valuesmap.entrySet();
		Iterator iterator3 = set3.iterator();
		while (iterator3.hasNext()) {
			Map.Entry me2 = (Map.Entry) iterator3.next();
			System.out.print(me2.getKey() + ": ");
			System.out.println(me2.getValue());
		}

		// int size() method returns the number of key value pairs
		System.out.println("Size of HashMap : " + hmap.size());
		// Removing all Mapping
		hmap.clear();
		// int size() method returns the number of key value pairs
		System.out.println("after clear hashmap Size  : " + hmap.size());
		hmap.put(12, "Chaitanya");
		hmap.put(2, "Rahul");
		hmap.put(7, "Singh");
		hmap.put(49, "Ajeet");
		hmap.put(3, "Anuj");
		hmap.put(8, "Anuj");
		hmap.put(9, "Anuj");
		System.out.println("after insert hashmap Size  : " + hmap.size());

		// Checking again
		System.out.println("Is HashMap Empty? " + hmap.isEmpty());

		// Checking Value Existence
		boolean flag = hmap.containsValue("Singh");
		System.out.println("String Singh exists in HashMap? : " + flag);

		try {
			FileOutputStream fos = new FileOutputStream("c:/tmp/hashmap.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(hmap);
			oos.close();
			fos.close();
			System.out.printf("Serialized HashMap data is saved in hashmap.ser");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		HashMap<Integer, String> dmap = null;
		try {
			FileInputStream fis = new FileInputStream("c:/tmp/hashmap.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			dmap = (HashMap) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized HashMap..");
		// Display content using Iterator
		Set set4 = dmap.entrySet();
		Iterator diterator = set4.iterator();
		while (diterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) diterator.next();
			System.out.print("Deser key: " + mentry.getKey() + " & Value: ");
			System.out.println(mentry.getValue());
		}

		// Create another HashMap
		HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();

		// Adding elements to the recently created HashMap
		hmap2.put(11, "Hello");
		hmap2.put(22, "Hi");

		// Copying one HashMap "hmap" to another HashMap "hmap2"
		hmap2.putAll(hmap);

		set4 = hmap2.entrySet();
		diterator = set4.iterator();
		while (diterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) diterator.next();
			System.out.print("addALl key: " + mentry.getKey() + " & Value: ");
			System.out.println(mentry.getValue());
		}

		System.out.println("HashMap contains: " + hmap);

		// Creating a new HashMap
		hmap = new HashMap<Integer, String>();

		// cloning first HashMap in the second one
		hmap = (HashMap) hmap2.clone();

		System.out.println("Cloned Map contains: " + hmap);
	}

	public void LinkedListTest() {
		LinkedList<String> linkedlist = new LinkedList<String>();
		/*
		 * add(String Element) is used for adding the elements to the linked
		 * list
		 */
		linkedlist.add("Item1");
		linkedlist.add("Item5");
		linkedlist.add("Item3");
		linkedlist.add("Item6");
		linkedlist.add("Item2");
		System.out.println("Linked List Content: " + linkedlist);

		/* Add First and Last Element */
		linkedlist.addFirst("First Item");
		linkedlist.addLast("Last Item");
		System.out.println("LinkedList Content after addition: " + linkedlist);

		/* This is how to get and set Values */
		Object firstvar = linkedlist.get(0);
		System.out.println("First element: " + firstvar);
		linkedlist.set(0, "Changed first item");
		Object firstvar2 = linkedlist.get(0);
		System.out.println("First element after update by set method: " + firstvar2);

		/* Remove first and last element */
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("LinkedList after deletion of first and last element: " + linkedlist);

		/* Add to a Position and remove from a position */
		linkedlist.add(0, "Newly added item");
		linkedlist.remove(2);
		System.out.println("Final Content: " + linkedlist);

		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("String1");
		arraylist.add("String2");
		linkedlist.addAll(arraylist);
		System.out.println("LinkedList after addall : " + linkedlist);

		linkedlist.addAll(2, arraylist);
		System.out.println("LinkedList after addAll : " + linkedlist);
		Object o = linkedlist.pollFirst();
		System.out.println("LinkedList after pollFirst : " + linkedlist);

		List sublist = linkedlist.subList(2, 5);
		System.out.println("Sublist  : " + sublist);

		Iterator it = linkedlist.descendingIterator();
		System.out.println("Elements in Reverse Order:");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Obtaining ListIterator
		ListIterator listIt = linkedlist.listIterator();

		// Iterating the list in forward direction
		System.out.println("Forward iteration:");
		while (listIt.hasNext()) {
			System.out.print(listIt.next() + " ");
		}
		System.out.println();

		// Iterating the list in backward direction
		System.out.println("\nBackward iteration:");
		while (listIt.hasPrevious()) {
			System.out.print(listIt.previous() + " ");
			;
		}
		System.out.println();

		// contains() method checks whether the element exists
		if (linkedlist.contains("CC")) {
			System.out.println("Element CC is present in List");
		} else {
			System.out.println("List doesn't have element CC");
		}

		// Creating another list
		LinkedList<String> list2 = new LinkedList<String>();

		// Clone list to list2
		/*
		 * public Object clone(): Returns a shallow copy of this LinkedList.
		 * (The elements themselves are not cloned.)
		 */
		list2 = (LinkedList) linkedlist.clone();

		// Displaying elements of second LinkedList
		System.out.println("List 2 Elements: " + list2);

		System.out.println("LastIndex of String2:" + list2.lastIndexOf("String2"));

		// push Element the list
		list2.push("NEW ELEMENT");

		// Display after push operation
		System.out.println("LinkedList contains: " + list2);

		// pop Element from list and display it
		System.out.println("Element removed: " + list2.pop());
		System.out.println("LinkedList contains: " + list2);

		System.out.println("Element removed: " + list2.pollFirst());

		// Display list after calling pollFirst() method
		System.out.println("LinkedList after: " + list2);

		System.out.println("Element removed: " + list2.pollLast());

		// Display after calling pollLast() method
		System.out.println("LinkedList after: " + list2);

		// peek()
		System.out.println(list2.peek());

		// peekFirst()
		System.out.println(list2.peekFirst());

		// peekLast()
		System.out.println(list2.peekLast());

		// Should be same as peek methods does not remove
		System.out.println("LinkedList after: " + list2);

		List<String> list = new ArrayList<String>(list2);

		for (String str : list) {
			System.out.print(str + " ");
		}

		System.out.println();

		// Converting LinkedList to Array
		String[] array = linkedlist.toArray(new String[linkedlist.size()]);

		// Displaying Array content
		System.out.println("Array Elements:");
		for (String element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public void TreeMapTest() {
		Map<String, Integer> naturalOrdering = new TreeMap<String, Integer>();
		naturalOrdering.put("Sam", 258963147);
		naturalOrdering.put("John", 5874569);
		naturalOrdering.put("Sunny", 58963147);
		naturalOrdering.put("Linda", 523658);
		naturalOrdering.put("Amit", 5333658);
		naturalOrdering.put("Sheila", 4566878);
		naturalOrdering.put("Lili", 852369);

		// headMap method usage
		SortedMap<String, Integer> headMapElements = ((TreeMap) naturalOrdering).headMap("Linda");
		System.out.println("Output of headMap method ");
		for (Map.Entry entry : headMapElements.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		System.out.println(" ");
		System.out.println("To Interator method ");
		for (Map.Entry entry : naturalOrdering.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		// tailMap method usage
		SortedMap<String, Integer> tailMapElements = ((TreeMap) naturalOrdering).tailMap("Sheila");
		System.out.println("Output of tailMap method ");
		for (Map.Entry entry : tailMapElements.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		// subMap method usage
		SortedMap<String, Integer> subMapElements = ((TreeMap) naturalOrdering).subMap("Amit", "Sheila");
		System.out.println("output of subMap method ");
		for (Map.Entry entry : subMapElements.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		NavigableSet reverse = ((TreeMap) naturalOrdering).descendingKeySet();
		NavigableMap reverseMap = ((TreeMap) naturalOrdering).descendingMap();

		String key = (String) ((TreeMap) naturalOrdering).ceilingKey("Sheil"); // smallest
																				// key
																				// greter
																				// than
																				// equal
		String key2 = (String) ((TreeMap) naturalOrdering).floorKey("Shei"); // opposite
																				// to
																				// ceiling
																				// key
		Map.Entry ceilingEntry = ((TreeMap) naturalOrdering).ceilingEntry("Sheila");
		Map.Entry floorEntry = ((TreeMap) naturalOrdering).floorEntry("Sheila");
		Map.Entry higherEntry = ((TreeMap) naturalOrdering).higherEntry("2");
		Map.Entry lowerEntry = ((TreeMap) naturalOrdering).lowerEntry("2");
		Map.Entry first = ((TreeMap) naturalOrdering).pollFirstEntry();
		Map.Entry last = ((TreeMap) naturalOrdering).pollLastEntry();

		System.out.println("Ceiling key " + key + " floorkey " + key2 + " ceilingEntry " + ceilingEntry.getKey()
				+ " floorEntry " + floorEntry.getKey() + " " + " higherEntry " + higherEntry.getKey());
		// TreeMap customSortingMap = new TreeMap(Comparator comparator);
		// TreeMap sameOrderMap = new TreeMap(SortedMap sm);

	}
}
