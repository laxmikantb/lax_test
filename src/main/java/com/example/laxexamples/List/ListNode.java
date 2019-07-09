package com.example.laxexamples.List;

public class ListNode {
	public ListNode root = null;
	int val;
	ListNode next;
	ListNode(int x) { 
		val = x; 
		next = null;
		if (root == null) root = this;
	}
	public void addNode(ListNode l) {
		ListNode current = root;
		if (current == null)
		{
			root = l;
		}
		else {
			while (current != null)
			{
				if (current.next == null)
					break;
				else
					current = current.next;
			}
		current.next = l;
		}
	}
	
	public void print() {
		ListNode current = root;
		System.out.println("=============");
		while(current != null) {
			System.out.println(current.val);
			current = current.next;
		}
	}
}
