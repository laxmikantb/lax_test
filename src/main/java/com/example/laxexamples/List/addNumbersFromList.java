package com.example.laxexamples.List;

public class addNumbersFromList {
		public static void main(String[] args)
		{
			ListNode firstList = null;
			ListNode secondList = null;
			
			firstList = new ListNode(2);
			firstList.addNode(new ListNode(4));
			firstList.addNode(new ListNode(3));
			
			secondList = new ListNode(5);
			secondList.addNode(new ListNode(6));
			secondList.addNode(new ListNode(9));
			secondList.addNode(new ListNode(2));
			
			firstList.print();
			secondList.print();
			new addNumbersFromList().addList(firstList, secondList);
			
		}
		
		public void addList(ListNode f, ListNode s) {
			ListNode dummyHead = new ListNode(0);
			ListNode curr = dummyHead;
			int carry = 0;
			
			while (f != null && s != null) {
				int x = (f != null) ? f.val : 0;
				int y = (s != null) ? s.val : 0;
				int sum = carry + x + y;
				carry = sum / 10;
				curr.addNode(new ListNode(sum % 10));
				if (f != null) f = f.next;
				if (s != null) s = s.next;
			}
			if (carry != 0)
				curr.addNode(new ListNode(carry));
			curr.print();
			
			
		}

}
