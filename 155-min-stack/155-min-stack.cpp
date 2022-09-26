class MinStack {
public:
    stack<int> st;
    stack<int> minElements;
    int minVal = INT_MAX;
    MinStack() {
        
    }
    
    void push(int val) {
        minVal = min(minVal, val);
        if(minElements.empty() || minVal <= minElements.top()){
            minElements.push(minVal);
        }
        st.push(val);
    }
    
    void pop() {
        if(minVal == minElements.top()){
            minElements.pop();
            if(!minElements.empty()){
                minVal = minElements.top();
            }
            else{
                minVal = INT_MAX;
            }
            
        }
        st.pop();
    }
    
    int top() {
        return st.top();
    }
    
    int getMin() {
        return minVal;
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */