public class DoubleLinkSortedInsert {

	 private Node head;  
	  
	 private class Node {  
	 private int data;  
	 private Node next;  
	 private Node prev;
	 
	  Node() {  
	   this.next = null;  
	   this.prev = null;
	  }  
	} 
	 
	Node SortedInsert(Node head,int data) {
	    Node newNode = new Node();
	    newNode.data = data;
	    if (head == null) {
	        return newNode;
	    }
	    else if (data <= head.data) {
	        newNode.next = head;
	        head.prev = newNode;
	        return newNode;
	    }
	    else {
	        Node rest = SortedInsert(head.next, data);
	        head.next = rest;
	        rest.prev = head;
	        return head;
	    }
	}
	
	 private Node Reverse(Node head) {
				Node currNode = head;
				Node nextNode = null;
				Node prevNode = null;

				while(currNode!=null){
					nextNode = currNode.next;
					currNode.next = prevNode;
					prevNode.prev = nextNode;
					currNode = nextNode;
				}
				head = prevNode;
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
		  DoubleLinkSortedInsert list1 = new DoubleLinkSortedInsert();  
		  // Creating a linked list  
		  Node temp = null;
		  Node temp2 = null;
		  Node head= null;
		  head = list1.SortedInsert(head, 2);
		  head = list1.SortedInsert(head, 22);
		  head = list1.SortedInsert(head, 2);
		  head = list1.SortedInsert(head, 11);
		  head = list1.SortedInsert(head, 6);
		  head = list1.SortedInsert(head, 7);
		  
		  list1.printList(head);
		  
		  head = list1.Reverse(head);
		  list1.printList(head);
	}

}
