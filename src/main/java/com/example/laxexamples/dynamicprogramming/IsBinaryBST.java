package com.example.laxexamples.dynamicprogramming;

public class IsBinaryBST {

	class Node
	{
	    int data;
	    Node left, right;
	 
	    public Node(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	}
	
   private boolean checkBST(Node root)  
   {
       return isBST(root, Integer.MIN_VALUE,
                              Integer.MAX_VALUE);
   }


   private boolean isBST(Node node, int min, int max)
   {
       if (node == null)
           return true;

       if (node.data < min || node.data > max)
           return false;

       return (isBST(node.left, min, node.data-1) &&
               isBST(node.right, node.data+1, max));
   }
   
	public static void main(String[] args) {
		IsBinaryBST tree = new IsBinaryBST();
        Node root = tree.new Node(4);
        root.left = tree.new Node(2);
        root.right = tree.new Node(5);
        root.left.left = tree.new Node(1);
        root.left.right = tree.new Node(3);
 
        if (tree.checkBST(root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");

	}

}
