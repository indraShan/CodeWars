class TreeNode {

    TreeNode left;
    TreeNode right;
    int value;

    TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    TreeNode(int value) {
        this(value, null, null);
    }
}

public class Solution {
  
  	static TreeNode arrayToTree(int[] array, int index) {
  		if (index >= array.length) {
  			return null;
  		}
		return new TreeNode(array[index], arrayToTree(array, (index * 2) + 1), arrayToTree(array, (index * 2) + 2));
  	}
  	  
    static TreeNode arrayToTree(int[] array) {
        // if (array.length == 0) {
        //   return null;
        // }
        // TreeNode root = new TreeNode(array[0]);
        // TreeNode[] nodes = new TreeNode[array.length];
        // nodes[0] = root;
        // for (int index = 1; index < array.length; index++) {
        //   TreeNode node = new TreeNode(array[index]);
        //   int parentIndex = (int)Math.floor((index-1)/2);
        //   TreeNode parent = nodes[parentIndex];
        //   if (index % 2 == 0) {
        //     parent.right = node;
        //   }
        //   else {
        //     parent.left = node;
        //   }
        //   nodes[index] = node;
        // }
        return arrayToTree(array, 0);
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		TreeNode root = sol.arrayToTree(new int[] {17, 0, -4, 3, 15, 18 ,25});
	}
}