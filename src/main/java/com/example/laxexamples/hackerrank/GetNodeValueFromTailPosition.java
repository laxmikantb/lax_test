


import java.util.LinkedList;

public class GetNodeValueFromTailPosition{
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
	  
    public int GetNode(Node head, int n) // get value of nth position node from tail
	{
    	Node fastNode = head;
    	Node slowNode = head;
    	int position = n+1;
    	if (head == null) {
    		return -1;
    	}
    	if (n < 0)
    		return -1;
    	
    	for (int i=0; (i < position && fastNode != null); i++) {
    		fastNode = fastNode.next;
    	}
    	
    	if (fastNode != null) {
    	   while (fastNode != null) {
    		   fastNode = fastNode.next;
    		   slowNode = slowNode.next;
    	   }
    	   return slowNode.data;
    	}
    	return head.data;
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
	 


	public static void main(String[] args) {
		GetNodeValueFromTailPosition list1 = new GetNodeValueFromTailPosition();  
		  // Creating a linked list  
		  Node head= null;
		  head = list1.InsertNth(head,2,0);
		  head = list1.InsertNth(head,4,1);  
		  head = list1.InsertNth(head, 7, 2);  
		  head = list1.InsertNth(head, 10,3);  
		  head = list1.InsertNth(head,14, 5); 
		  head = list1.InsertNth(head,1,6);
		  head = list1.InsertNth(head,2,7);  
		  head = list1.InsertNth(head, 3, 8);  
		  head = list1.InsertNth(head, 17,9);  
		  head = list1.InsertNth(head,18, 10); 
		  list1.printList(head);
		  System.out.println(list1.GetNode(head, 0));
		  System.out.println(list1.GetNode(head, 2));
		  System.out.println(list1.GetNode(head, -1));
	}

}
