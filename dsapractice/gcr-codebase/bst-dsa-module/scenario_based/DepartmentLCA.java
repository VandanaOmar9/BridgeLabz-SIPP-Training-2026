public class DepartmentLCA {
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node lowestCommonAncestor(Node root, int p, int q) {
        Node current = root;
        while (current != null) {
            if (p < current.val && q < current.val) current = current.left;
            else if (p > current.val && q > current.val) current = current.right;
            else return current;
        }
        return null;
    }
}