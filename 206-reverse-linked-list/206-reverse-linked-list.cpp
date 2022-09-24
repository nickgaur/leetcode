class Solution {
public:
    ListNode* reverseList(ListNode* head) {
    ListNode*curr=head,*temp=NULL;
    while(head!=NULL)
    { 
        curr=curr->next;
        head->next=temp;
        temp=head;
        head=curr;
    }
    return temp;
}
};