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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        ListNode duplicate = head;
        while (curr.next != null) {
            if (curr.val == curr.next.val) {
                while(curr.next != null && curr.val == curr.next.val){
                    curr = curr.next;
                }
                duplicate.next = curr.next;
            } else {
                curr = curr.next;
                duplicate = duplicate.next;
            }
        }
        return head;
    }
}