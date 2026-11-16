/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
          if(root == null){
		        return 0;
		    }
		    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        // if(root == null){
        //     return 0;
        // }
        // int res = 0;
		// Queue<TreeNode> q = new LinkedList<>();
		// q.offer(root);
		// while (!q.isEmpty()) {
		// 	//  Node curr = q.poll();
		// 	int t = q.size();
		// 	for (int i = 0 ; i < t; i++) {
		// 	    TreeNode curr = q.poll();
		// 	    if(i == 0){
		// 	        res++;
		// 	    }
		// 		if (curr.left != null) {
		// 			q.offer(curr.left);
		// 		}
		// 		if (curr.right != null) {
		// 			q.offer(curr.right);
		// 		}
		// 	}
		// }
		// return res;
    }
}