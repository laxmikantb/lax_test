package com.example.laxexamples.dynamicprogramming;



import java.util.LinkedList;

public class MergeSortedLinkList{
	 private Node head;  
	  
	 private class Node {  
	 private int data;  
	 private Node next;  
	  
	  Node() {  
	   this.next = null;  
	  
	  }  
	 }  
	 public Node InsertNth(Node head, int data, int position) {
		 
		    Node newNode = new Node();
		    newNode.data = data;
		    if (head == null)
		    {
		    	return newNode;
		    }

		    if(position == 0) {
		        newNode.next = head;
		        return newNode;
		    }
		    
		    Node cur = head;
		    Node prev = head;
		    int curPos = 0;
		    while(curPos != position - 1 && cur != null) {
		    	prev = cur;
		        cur = cur.next;
		        curPos += 1;
		    }
		    if (cur == null) {
		    	cur = prev;
		    }
		    newNode.next = cur.next;
		    cur.next = newNode;
		    return head;
	 }        		 
	  
	 public Node DeleteNth(Node head, int position) {
		 
		    if (head == null)
		    {
		    	return null;
		    }

		    Node temp = head;
		    if(position == 0) {
		        head = temp.next;
		    }
		    
		    Node cur = head;
		    Node prev = head;
		    int curPos = 0;
		    while(curPos != position && cur != null) {
		    	prev = cur;
		        cur = cur.next;
		        curPos += 1;
		    }

		    temp = cur.next;
		    prev.next = temp;
		    return head;
	 }    
	 
 
	 public void printList(Node head) {  
		  Node temp = head;  
		  while (temp != null) {  
		   System.out.format("%d ", temp.data);  
		   temp = temp.next;  
		  }  
		  System.out.println();  
	 }  
	 
	public Node mergeTwoLists(Node headA, Node headB) {
      	Node dummyhead= new Node();
      	dummyhead.data = Integer.MIN_VALUE;
      	Node current = dummyhead;
      	Node firstList = headA;
      	Node secondList = headB;
      	
      	while (firstList != null && secondList != null) {
      		if (firstList.data <= secondList.data) {
      			current.next = firstList;
      			firstList = firstList.next;
      		}
      		else
      		{
      			current.next = secondList;
      			secondList = secondList.next;
      		}
      		current = current.next;
      	}
      	
      	if (firstList != null) current.next = firstList;
      	if (secondList != null) current.next = secondList;
      	
      	

        return dummyhead.next;
	}


	public static void main(String[] args) {
		MergeSortedLinkList list1 = new MergeSortedLinkList();  
		  // Creating a linked list  
		  Node head= null;
		  head = list1.InsertNth(head,2,0);
		  head = list1.InsertNth(head,4,1);  
		  head = list1.InsertNth(head, 7, 2);  
		  head = list1.InsertNth(head, 10,3);  
		  head = list1.InsertNth(head,14, 5); 
		  list1.printList(head);
		  
		  MergeSortedLinkList list2 = new MergeSortedLinkList();
		  Node head2= null;
		  head2 = list2.InsertNth(head2,1,0);
		  head2 = list2.InsertNth(head2,2,1);  
		  head2 = list2.InsertNth(head2, 3, 2);  
		  head2 = list2.InsertNth(head2, 17,3);  
		  head2 = list2.InsertNth(head2,18, 5); 
		  
		  list1.printList(head2);
		  head = list1.mergeTwoLists(head, head2);
		  list1.printList(head);

	}

}
