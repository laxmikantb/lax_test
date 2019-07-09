package com.example.laxexamples.dynamicprogramming;
import java.util.LinkedList;

public class NodeInsert {
	 private Node head;  
	  
	 private class Node {  
	 private int data;  
	 private Node next;  
	  
	  Node() {  
	   this.next = null;  
	  
	  }  
	 }  
	  
	 public void Insert(Node node, int data) {  
	  
	  if (head == null) {  
		  head = new Node();
		  
	  } else {  
	   Node temp = head;  
	   while (temp.next != null)  
	    temp = temp.next;  
	  
	   temp.next = node;  
	  }  
	 }  
	 
	 public void printList(Node head) {  
		  Node temp = head;  
		  while (temp != null) {  
		   System.out.format("%d ", temp.data);  
		   temp = temp.next;  
		  }  
		  System.out.println();  
	 }  
	 
	public Node addLists(Node l1, Node l2, int carry) {
		if (l1 == null && l2 == null && carry == 0)
		{
			return null;
		}
		int value = carry;
		if (l1 != null)
		{
			value += l1.data;
		}
		
		if (l2 != null)
			value += l2.data;
		Node result = new Node();
		result.data = value % 10;
		result.data = value % 10; // second digit is number and 1st digit is carry;
		
		if (l1 != null || l2 != null) {
			Node more = addLists(l1 == null ? null : l1.next, l2 == null ? null : l2.next, value > 10? 1:0);
			result.next=more;
		}
		return result;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NodeInsert list1 = new NodeInsert();  
		  // Creating a linked list  
		  Node head=list1.new Node();
		  list1.Insert(head,5);
		  list1.Insert(head, 6);  
		  list1.Insert(head, 7);  
		  list1.Insert(head, 1);  
		  list1.Insert(head,2); 
		  
		  list1.printList(head);
		  NodeInsert list2 = new NodeInsert();  
		  // Creating a linked list  
		  Node head2=list2.new Node();  
		  list2.Insert(head2,5);  
		  list2.Insert(head2,6);  
		  list2.Insert(head2,7);  
		  list2.Insert(head2,9);  
		  list2.Insert(head2,9); 
		  list2.Insert(head2,8); 
		  list2.printList(head2);
		  Node result = list1.addLists(head, head2, 0);
		  list2.printList(result);
	}

}
