package com.example.laxexamples.dynamicprogramming;



import java.util.LinkedList;


public class CycleDetection{
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
	  
	 public Node GetNode(Node head, int n) // get value of nth position node from tail
	 {
	    	Node fastNode = head;
	    	Node slowNode = head;
	    	int position = n+1;
	    	if (head == null) {
	    		return null;
	    	}
	    	if (n < 0)
	    		return null;
	    	
	    	for (int i=0; (i < position && fastNode != null); i++) {
	    		fastNode = fastNode.next;
	    	}
	    	
	    	if (fastNode != null) {
	    	   while (fastNode != null) {
	    		   fastNode = fastNode.next;
	    		   slowNode = slowNode.next;
	    	   }
	    	   return slowNode;
	    	}
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
	 
   public boolean hasCycle(Node head) {
	   Node fast = head;
	   Node slow = head;
	   boolean hasCycle = false;
	   Node cycleStartNode = null;
	   while (fast != null && fast.next != null && fast.next.next != null) {
		   slow = slow.next;
		   fast = fast.next.next;
		   if (slow == fast) {
			   // there is a cyclic link
			   hasCycle = true;
			   cycleStartNode = slow;
			   int cycleLen = 0;
			   do {
				   ++cycleLen;
				   fast = fast.next;
			   }
			   while (slow != fast);
		   }
		   if (hasCycle) break;
	   }
	   return hasCycle;
   }

	public static void main(String[] args) {
		CycleDetection list1 = new CycleDetection();  
		  // Creating a linked list  
		  Node temp = null;
		  Node temp2 = null;
		  Node head= null;
		  head = list1.InsertNth(head,2,0);
		  head = list1.InsertNth(head,2,1);  
		  head = list1.InsertNth(head, 7, 2);  
		  head = list1.InsertNth(head, 10,3);  
		  head = list1.InsertNth(head,14, 5); 
		  head = list1.InsertNth(head,15,6);
		  head = list1.InsertNth(head,15,7);  
		  head = list1.InsertNth(head,16, 8);  
		  head = list1.InsertNth(head,16,9);  
		  head = list1.InsertNth(head,16, 10); 
		  temp = list1.GetNode(head,8);
		  temp2 = list1.GetNode(head,2);
		  list1.printList(head);
		  temp2.next = temp;
		  System.out.println(list1.hasCycle(head));
	}

}
