
public class FlattenTree {
	class Node {
		Node right;
		Node left;
		int val;
	}
	
	Node pre = null;
	
	void helper(Node root)
	{
		if (root == null) return;
		helper(root.right);
		helper(root.left);
		root.left = null;
		root.right=pre;
		pre = root;
	}
}
