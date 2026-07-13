public class LogStreamMerger {
    public Node mergeLogStreams(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a; a = a.next;
            } else {
                tail.next = b; b = b.next;
            }
            tail = tail.next;
        }
        tail.next = (a != null) ? a : b;
        return dummy.next;
    }
}

class Node {
    int val;
    Node next;
    Node(int val) { 
        this.val = val; 
        this.next = null; 
    }
}