class MinStack {
public:
    vector<int> st;
    vector<int> minElements;
    int minVal = INT_MAX;
    MinStack() {
        
    }
    
    void push(int val) {
        minVal = min(minVal, val);
        if(minElements.empty() || minVal <= minElements.back()){
            minElements.push_back(minVal);
        }
        st.push_back(val);
    }
    
    void pop() {
        if(minVal == minElements.back()){
            minElements.pop_back();
            if(!minElements.empty()){
                minVal = minElements.back();
            }
            else{
                minVal = INT_MAX;
            }
            
        }
        st.pop_back();
    }
    
    int top() {
        return st.back();
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