


import java.util.LinkedList;

public class DeleteDuplicatesFromList{
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
	  
	 public Node RemoveDuplicates(Node head) {
		 Node current = head;
		 Node nextNextNode = null;
		 
		 if (head == null)
			 return head;
		 
		 while (current.next != null) {
			 if (current.data == current.next.data) {
				 nextNextNode = current.next.next;
				 current.next = null;
				 current.next = nextNextNode;
			 }
			 else
				 current = current.next;
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
	 


	public static void main(String[] args) {
		DeleteDuplicatesFromList list1 = new DeleteDuplicatesFromList();  
		  // Creating a linked list  
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
		  list1.printList(head);
		  head = list1.RemoveDuplicates(head);
		  list1.printList(head);
	}

}
