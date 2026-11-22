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
    static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public int findBottomLeftValue(TreeNode root) {
        int h = height(root);
        int res = -1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int idx = 0;
        while(idx < h-1){
            int n = q.size();
            for(int i = 0 ; i < n; i++){
                TreeNode curr = q.poll();
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
            }
            idx++;
        }
        res = q.poll().val;
        return res;
    }

}