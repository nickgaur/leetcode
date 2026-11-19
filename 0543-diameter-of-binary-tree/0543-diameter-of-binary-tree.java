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
    static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }
    static int calculateDiameter(TreeNode root){
        if(root == null){
            return 0;
        }
        int d1 = height(root.left) + height(root.right) + 1;
        int d2 = calculateDiameter(root.left);
        int d3 = calculateDiameter(root.right);
        return Math.max(d1, Math.max(d2, d3));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return calculateDiameter(root) -1;
    }
}