import java.util.Stack;

public class SumLinkList {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		SumLinkList list = new SumLinkList();
		Node l1 = null;
		l1 = list.Insert(l1, 7);
		l1 = list.Insert(l1, 2);
		l1 = list.Insert(l1, 4);
		l1 = list.Insert(l1, 3);

		Node l2 = null;
		l2 = list.Insert(l2, 5);
		l2 = list.Insert(l2, 6);
		l2 = list.Insert(l2, 4);

		Node sumlist = null;
		Stack<Integer> sumq = list.addTwoListFromRightToLeft(l1, l2);
		while (!sumq.isEmpty()) {
			sumlist = list.Insert(sumlist, sumq.pop());
		}

		list.printList(sumlist);
	}

	Stack<Integer> addTwoListFromRightToLeft(Node l1, Node l2) {
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<Integer>();
		Stack<Integer> result = new Stack<Integer>();

		while (l1 != null) {
			s1.push(l1.data);
			l1 = l1.next;
		}
		while (l2 != null) {
			s2.push(l2.data);
			l2 = l2.next;
		}
		int carry = 0;
		while (!s1.isEmpty() && !s2.isEmpty()) {
			int sum = s1.peek() + s2.peek() + carry;
			carry = sum / 10;
			result.add(sum % 10);
			s1.pop();
			s2.pop();
		}
		Stack<Integer> remainder = s1.isEmpty() ? s2 : s1;
		while (!remainder.isEmpty()) {
			int sum = remainder.pop() + carry;
			carry = sum / 10;
			result.add(sum % 10);
		}
		if (carry != 0) {
			result.add(carry);
		}
		return result;
	}

	Node Insert(Node root, int data) {
		Node n = new Node(data);
		if (root == null) {
			root = n;
		} else {
			Node prev = root;
			Node temp = root;
			while (temp != null) {
				prev = temp;
				temp = temp.next;
			}
			prev.next = n;
		}
		return root;
	}

	public void printList(Node n) {
		Node temp = n;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();

	}

}
