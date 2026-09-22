class Node {
    int val = 0;
    Node next = null;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    Node startNode;

    public MyLinkedList() {
    }

    public int get(int index) {
        Node curr = startNode;
        for (int i = 0; curr != null && i < index; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            return -1;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if (startNode == null) {
            startNode = node;
            return;
        }
        node.next = startNode;
        startNode = node;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        Node curr = startNode;
        if(startNode == null){
            startNode = node;
            return;
        }
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
    }

    public void addAtIndex(int index, int val) {
        Node node = new Node(val);
        Node curr = startNode;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        for (int i = 0; curr != null && i < index - 1; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            return;
        }
        node.next = curr.next;
        curr.next = node;
    }

    public void deleteAtIndex(int index) {
        if(startNode == null){
            return;
        }
        Node curr = startNode;
        if (index == 0) {
            startNode = curr.next;
        }
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        if(curr == null || curr.next == null){
            return;
        }
        curr.next = curr.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */