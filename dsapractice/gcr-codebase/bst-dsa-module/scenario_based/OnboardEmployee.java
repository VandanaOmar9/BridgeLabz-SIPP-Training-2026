public class OnboardEmployee {
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node insert(Node node, int id) {
        if (node == null) return new Node(id);
        if (id < node.val) node.left = insert(node.left, id);
        else if (id > node.val) node.right = insert(node.right, id);
        return node;
    }
}