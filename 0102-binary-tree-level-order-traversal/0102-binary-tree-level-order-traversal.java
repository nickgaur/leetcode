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
    static int findHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftBranch = findHeight(root.left);
        int rightBranch = findHeight(root.right);
        return Math.max(leftBranch, rightBranch) + 1;
    }

    static List<Integer> printNodes(TreeNode root, int k){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return new ArrayList<>();
        }
        if(k == 0){
            list.add(root.val);
            return list;
        }
        List<Integer> leftBranch = printNodes(root.left, k-1);
        List<Integer> rightBranch = printNodes(root.right, k-1);
        for(int i: leftBranch){
            list.add(i);
        }
        for(int i: rightBranch){
            list.add(i);
        }
        return list;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        int height = findHeight(root);
        System.out.println(height);
        List<List<Integer>> result = new ArrayList<>();
        // List<Integer> result = new ArrayList<>();
        for(int i = 0 ;i < height; i++){
            result.add(printNodes(root, i));
        }
        return result;

    }
}