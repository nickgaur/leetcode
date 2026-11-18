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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Deque<TreeNode> q = new LinkedList<>();
        int idx = 0;
        q.offerFirst(root);
        // System.out.print(q.peekFirst().val + " ");
        List<Integer> list = new ArrayList<>();
        list.add(q.peekFirst().val);
        result.add(list);
        while(!q.isEmpty()){
        list = new ArrayList<>();
            int t = q.size();
            for(int i =0; i < t; i++){
                if(idx % 2 == 0){
                    TreeNode curr = q.pollLast();
                    if(curr.right != null){
                        // System.out.print(curr.right.val + " ");
        list.add(curr.right.val);
                        // list.
                        q.offerFirst(curr.right);
                    }
                    if(curr.left != null){
                        // System.out.print(curr.left.val + " ");
        list.add(curr.left.val);
                        q.offerFirst(curr.left);
                    }
                    
                }
                else{
                    TreeNode curr = q.pollFirst();
                    if(curr.left != null){
                        // System.out.print(curr.left.val + " ");
        list.add(curr.left.val);
                        q.offerLast(curr.left);
                    }
                    if(curr.right != null){
                        // System.out.print(curr.right.val + " ");
        list.add(curr.right.val);
                        q.offerLast(curr.right);
                    }
                }
            }
            if(list.size() > 0){
            result.add(list);
            }
            idx++;
        }
        return result;
    }
}