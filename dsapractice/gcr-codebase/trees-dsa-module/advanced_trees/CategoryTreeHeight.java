public class CategoryTreeHeight {
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public int height(Node node) {
        if (node == null) return -1;
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public boolean isTooDeep(Node root, int threshold) {
        return height(root) > threshold;
    }
}