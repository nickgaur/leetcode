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
    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        int res = 0;
        int rem = 0;
        while(curr != null){
            res = rem * 2 + curr.val;
            rem = res;
            curr = curr.next;
        }
        return res;
    }
}