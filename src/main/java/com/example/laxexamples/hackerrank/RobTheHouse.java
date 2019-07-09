
public class RobTheHouse {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int maxLevelSum(TreeNode root){
		int[] sums = getSums(root, 0);
		return Math.max(sums[0], sums[1]);
	}


	public static int[] getSums(TreeNode node, int level){
		int[] res1 = new int[2];
		int[] res2 = new int[2];
		if (node.left != null)
			res1 = getSums(node.left, level+1);
		if (node.right != null)
			res2 = getSums(node.right, level+1);
		if (level %2 ==0){
			return new int[]{res1[0]+res2[0], res1[1]+res2[1]+ node.val};
		}
		else{
			return new int[]{res1[0]+res2[0] + node.val, res1[1]+res2[1]};
		}
	}
}
