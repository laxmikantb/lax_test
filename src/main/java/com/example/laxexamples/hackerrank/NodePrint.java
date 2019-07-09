import java.util.LinkedList;

public class NodePrint {
	 private Node head;  
	  
	 private class Node {  
	  private int value;  
	  private Node next;  
	  
	  Node(int value) {  
	   this.value = value;  
	  
	  }  
	 }  
	  
	 public void addToTheLast(Node node) {  
	  
	  if (head == null) {  
	   head = node;  
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
		   System.out.format("%d ", temp.value);  
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
			value += l1.value;
		}
		
		if (l2 != null)
			value += l2.value;
		Node result = new Node(value % 10);
		result.value = value % 10; // second digit is number and 1st digit is carry;
		
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
		NodePrint list1 = new NodePrint();  
		  // Creating a linked list  
		  Node head=list1.new Node(5); 
		  list1.addToTheLast(head);
		  list1.addToTheLast(list1.new Node(6));  
		  list1.addToTheLast(list1.new Node(7));  
		  list1.addToTheLast(list1.new Node(1));  
		  list1.addToTheLast(list1.new Node(2)); 
		  
		  list1.printList(head);
		  NodePrint list2 = new NodePrint();  
		  // Creating a linked list  
		  Node head2=list2.new Node(5);  
		  list2.addToTheLast(head2);  
		  list2.addToTheLast(list2.new Node(6));  
		  list2.addToTheLast(list2.new Node(7));  
		  list2.addToTheLast(list2.new Node(9));  
		  list2.addToTheLast(list2.new Node(9)); 
		  list2.addToTheLast(list2.new Node(8)); 
		  list2.printList(head2);
		  Node result = list1.addLists(head, head2, 0);
		  list2.printList(result);
	}
}
