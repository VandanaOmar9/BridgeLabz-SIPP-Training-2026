import java.util.ArrayDeque;
import java.util.Deque;

public class KthSmallestLatency {
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public int kthSmallest(Node root, int k) {
        Deque<Node> stack = new ArrayDeque<>();
        Node current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            if (--k == 0) return current.val;
            current = current.right;
        }
        throw new IllegalArgumentException("k out of range");
    }
}