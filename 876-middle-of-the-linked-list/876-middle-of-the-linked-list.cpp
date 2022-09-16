/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        ListNode *curr = head;
        int count = 0;
        while(curr != NULL){
            count++;
            curr = curr -> next;
        }
        count /= 2;
        int temp{0};
        curr = head;
        while(curr != NULL){
            if(temp == count){
                head = curr;
                break;
            }
            temp++;
            curr = curr -> next;
        }
        return head;
    }
};