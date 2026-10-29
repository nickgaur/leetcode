class MyHashSet {
    // Node head;
    int arr[] = new int[1000001];
    public MyHashSet() {
        Arrays.fill(arr, -1);
    }
    
    public void add(int key) {
        if(arr[key] < 0){
            arr[key]++;
            return;
        }
        // Node node = new Node(key);
        // if(head == null){
        //     head = node;
        //     return;
        // }
        // Node curr = head;
        // while(curr.next != null){
        //     if(curr.val == key){
        //         return;
        //     }
        //     curr = curr.next;
        // }
        // curr.next = node;
        // return;
    }
    
    public void remove(int key) {
        if(arr[key] >= 0){
            arr[key]--;
        }
        // if(head == null){
        //     return;
        // }
        // if(head.val == key){
        //     head = head.next;
        //     return;
        // }
        // Node curr = head;
        // while(curr.next != null){

        //     if(curr.next.val == key){
        //         curr.next = curr.next.next;
        //         return;
        //     }
        //     curr = curr.next;
        // }
    }
    
    public boolean contains(int key) {
        if(arr[key] >= 0){
            return true;
        }
        return false;
        // Node curr = head;
        // while(curr != null){
        //     if(curr.val == key){
        //         return true;
        //     }
        //     curr = curr.next;
        // }
        // return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */