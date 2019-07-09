package com.example.laxexamples.datastructure;

public class Tree {

	private TreeNode root;
	
	public void insert(int id, double dd)
	{
		TreeNode newNode = new TreeNode();
		newNode.dData = dd;
		newNode.iData = id;
		if (root == null)
			root = newNode;
		else
		{
			TreeNode current = root;
			TreeNode parent;
			
			while(true)
			{
				parent = current;
				if (id < current.iData) {
				  current = current.leftChild;
				  if (current == null) {
					  parent.leftChild = newNode;
					  return;
				  }
				} // end of go to left
				else // go to right
				{
					current = current.rightChild;
					if (current == null)
					{
						parent.rightChild= newNode;
						return;
					}
				} // end else go to right
			} // end while	
		}
	}
	
	public void inOrder(TreeNode localRoot)
	{
		if (localRoot != null)
		{
			inOrder(localRoot.leftChild);
			System.out.print( localRoot.iData + " ");
			inOrder(localRoot.rightChild);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
