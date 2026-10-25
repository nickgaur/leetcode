/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode curr1 = headA;
        int c1 = 0;
        while(curr1 != null){
            c1++;
            curr1 = curr1.next;
        }
        ListNode curr2 = headB;
        int c2 = 0;
        while(curr2 != null){
            c2++;
            curr2 = curr2.next;
        }
        if(c1 > c2){
            c1 = Math.abs(c1-c2);
            curr1 = headA;
            for(int i = 0 ; i < c1; i++){
                curr1 = curr1.next;
            }
            curr2 = headB;
        }
        else{
            c2 = Math.abs(c1-c2);
            curr2 = headB;
            for(int i = 0 ; i < c2; i++){
                curr2 = curr2.next;
            }
            curr1 = headA;
        }
        while(curr1 != null && curr2 != null){
            if(curr1 == curr2){
                return curr1;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return null;
        
    }
}