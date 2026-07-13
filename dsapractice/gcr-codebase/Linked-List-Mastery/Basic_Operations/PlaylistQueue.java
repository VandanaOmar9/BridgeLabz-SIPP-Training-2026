public class PlaylistQueue {
    public void insertAfter(Node current, int trackId) {
        if (current == null) return;
        Node newNode = new Node(trackId);
        newNode.next = current.next;
        current.next = newNode;
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