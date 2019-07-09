
public class CloneLinkListWithRandomPointers {
	class Node {
		Node next;
		Node r;
		int val;
		
		Node(int x) {
			next = null;
			r = null;
			val = x;
		}
	}
	
	public Node clone(Node root) {
		Node p = root;
		Node c = null;
		Node o = null;
		Node cloned = null;
		while (p != null)
		{
			c = new Node(p.val);
			if (o != null){
				o.next = c;
				o = c;
			}
			else {
			    o = c;
			    cloned = c;
			}
			p = p.next;
		}
		Node src = root;
		p = cloned;
		while(p != null) {
			Node temp = src.next;
			src.next = p;
			p.r = src.r;
			src = temp;
			p = p.next;
		}
		
		p = cloned;
		while(p != null)
		{
			if (p.r != null)
				p.r = p.r.next;
			p = p.next;
		}
		
		return cloned;
	}
	
	public Node insert(Node root, int x) {
		Node c= new Node(x);
		if (root == null)
		{
			root =c ;
		}
		else {
			Node p = root;
			Node prev = root;
			while (p != null)
			{
				prev = p;
				p = p.next;
			}
			prev.next = c;
		}
			
		return root;
	}
	
	public void insertRandom(Node root, int src, int dest) {
		int i =0;
		Node p = root;
		while (i <src-1 && p != null) {
			i++;
			p = p.next;
		}
		i =0;
		Node s = p;
		p = root;
		while (i <dest-1 && p != null) {
			i++;
			p = p.next;
		}
		
		s.r = p;
		
	}
	public void print(Node root)
	{
		Node p = root;
		while (p != null)
		{
			System.out.print(p.val + " ");
			if (p.r != null)
			{
				System.out.print("=" + p.r.val + "= ");
			}
			p = p.next;
		}
		System.out.println();;
	}
	
	public static void main(String[] args) {
		CloneLinkListWithRandomPointers sol = new CloneLinkListWithRandomPointers();
		Node root = sol.insert(null, 1);
		root = sol.insert(root, 2);
		root = sol.insert(root, 3);
		root = sol.insert(root, 4);
		root = sol.insert(root, 5);
		sol.insertRandom(root, 1, 3);
		sol.insertRandom(root, 2, 4);
		sol.print(root);
		sol.print(sol.clone(root));
	}
	
}
