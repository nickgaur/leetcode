/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        // Node node = new Node();
        if (root == null) {
            return root;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                Node curr = q.poll();
                if (curr.left != null) {
                    curr.left.next = curr.right;
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    if(curr.next != null){
                    curr.right.next = curr.next.left;
                    }
                    q.offer(curr.right);
                }
            }
        }
        return root;
    }
}