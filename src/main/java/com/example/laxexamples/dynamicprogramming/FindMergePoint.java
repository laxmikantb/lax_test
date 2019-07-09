package com.example.laxexamples.dynamicprogramming;


public class FindMergePoint {
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
	 
	public static int length(Node head) {
		int len = 0;
		while(head != null) {
			++len;
			head = head.next;
		}
		return len;
	}
	
	public static Node walkOverList(Node head, int steps) {
		while (steps-- > 0) {
			head = head.next;
		}
		return head;
	}
	
	
	public int FindMergeNode(Node headA, Node headB)
	{
		Node list1 = headA;
		Node list2 = headB;
		
		int headAlen = length(headA);
		int headBlen = length(headB);
		
		if (headAlen < headBlen) {
			list2 = walkOverList(list2, headBlen-headAlen);
		}
		else
			list1 = walkOverList(list1, headAlen-headBlen);
		
		while (list1 != null && list2 != null && (list1 != list2))
		{
			list1 = list1.next;
			list2 = list2.next;
		}
		if (list1 == null)
			return -1;
		return list1.data;
	}
	
	
	public static void main(String[] args) {
		FindMergePoint list1 = new FindMergePoint();  
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
		  
		  Node head2= null;
		  head2 = list1.InsertNth(head2,2,0);
		  head2 = list1.InsertNth(head2,2,1);  
		  head2 = list1.InsertNth(head2, 7, 2); 
		  temp2 = list1.GetNode(head,8);
		  head2.next = temp2;

		  System.out.println(list1.FindMergeNode(head, head2));
	}

}
