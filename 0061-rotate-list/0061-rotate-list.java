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
    static ListNode helper(ListNode head, int k){
        if(k <= 0){
            return head;
        }
        ListNode curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        ListNode temp = curr.next;
        curr.next = null;
        temp.next = head;
        head = temp;
        return helper(head, k-1);
    }
    public ListNode rotateRight(ListNode head, int k) {
        int n = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            n++;
        }
        if(head == null || n == 1){
            return head;
        }
        return helper(head, k%n);
    }
}