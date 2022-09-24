class Solution {
public:
    Node* connect(Node* root) {
        if(root == NULL){
            return root;
        }
        queue<Node*> q;
        root -> next = NULL;
        q.push(root);
        while(!q.empty()){
            queue<Node*>temp;
            
            while(!q.empty()){
                Node* n = q.front();
                q.pop();
                if(n -> left){
                    temp.push(n -> left);
                }
                if(n -> right){
                    temp.push(n -> right);
                }
                
            }
            q = temp;
            Node *n;
            if(!temp.empty()){
             n = temp.front();
             temp.pop();
            while(!temp.empty()){
                n -> next = temp.front();
                n = temp.front();
                temp.pop();
             }
            }
        }
        return root;
    }
};