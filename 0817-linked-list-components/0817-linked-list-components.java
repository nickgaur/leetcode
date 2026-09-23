/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        ListNode curr = head;
        int res = 0;
        int len = 0;
        while (curr != null) {
            if (set.contains(curr.val)) {
                len++;
                if (len == 1) {
                    res++;
                }
            } else {
                len = 0;
            }
            curr = curr.next;
        }
        return res;
    }
}