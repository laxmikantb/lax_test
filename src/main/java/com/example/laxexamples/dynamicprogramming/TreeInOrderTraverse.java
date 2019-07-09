package com.example.laxexamples.dynamicprogramming;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeInOrderTraverse {
/*
 * Given binary tree [1,null,2,3],
 * 
 * return 1,3,2
 */
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 
	public List<Integer> inorderTraversal(TreeNode root) {
	    List<Integer> list = new ArrayList<Integer>();

	    Stack<TreeNode> stack = new Stack<TreeNode>();
	    TreeNode cur = root;

	    while(cur!=null || !stack.empty()){
	        while(cur!=null){
	            stack.add(cur);
	            cur = cur.left;
	        }
	        cur = stack.pop();
	        list.add(cur.val);
	        cur = cur.right;
	    }

	    return list;
	}
}
