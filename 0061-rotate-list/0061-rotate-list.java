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
    // static ListNode
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }
        int n = 1;
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
            n++;
        }
        k = k % n;
        if(k == 0){
            return head;
        }
        curr.next = head;
        curr = head;
        k = n - k;
        for(int i = 0 ; i < k - 1; i++){
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;
        return head;
    }
}