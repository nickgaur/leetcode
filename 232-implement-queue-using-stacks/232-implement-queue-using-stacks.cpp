class MyQueue {
public:
    vector<int> st1;
    
    vector<int> st2;
    MyQueue() {
        
    }
    
    void push(int x) {
        st1.push_back(x);
        while(!st2.empty()){
            st2.pop_back();
        }        
        for(int i=st1.size() - 1; i>=0; i--){
            st2.push_back(st1[i]);
        }
    }
    
    int pop() {
        int t = st2.back();
        st2.pop_back();
        while(!st1.empty()){
            st1.pop_back();
        } 
        for(int i = st2.size() - 1; i>=0; i--){
            st1.push_back(st2[i]);
        }
        return t;
    }
    
    int peek() {
        return st2.back();
    }
    
    bool empty() {
        return st2.empty();
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */