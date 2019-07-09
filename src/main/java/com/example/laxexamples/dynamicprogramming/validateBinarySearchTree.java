package com.example.laxexamples.dynamicprogramming;

public class validateBinarySearchTree {
// Binary tree [2,1,3], return true.
		// Binary tree [1,2,3], return false.
	
	 public class TreeNode {
		      int val;
		     TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 
	    public boolean isValidBST(TreeNode root) {
	        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	    }
	    
	    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
	        if (root == null) return true;
	        if (root.val >= maxVal || root.val <= minVal) return false;
	        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
	    }
	 
	 
}
