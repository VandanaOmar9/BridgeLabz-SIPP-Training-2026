public class RelayChain {
    public Node findMiddleServer(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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