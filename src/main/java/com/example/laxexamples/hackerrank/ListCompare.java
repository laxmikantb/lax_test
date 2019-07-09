


import java.util.LinkedList;

public class ListCompare{
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
	 
     public int CompareList(Node headA, Node headB) {
         while (headA != null && headB != null)
         {
             if (headA.data != headB.data)
                 return 0;
             headA = headA.next;
             headB = headB.next;
         }
         if (headA == null && headB == null) return 1;
         return 0;
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
		ListCompare list1 = new ListCompare();  
		  // Creating a linked list  
		  Node head= null;
		  head = list1.InsertNth(head,3,0);
		  head = list1.InsertNth(head, 5,1);  
		  head = list1.InsertNth(head, 4, 2);  
		  head = list1.InsertNth(head, 2,3);  
		  head = list1.InsertNth(head,10, 1); 
		  list1.printList(head);
		  list1.DeleteNth(head, 2);
		  list1.printList(head);

	}

}
