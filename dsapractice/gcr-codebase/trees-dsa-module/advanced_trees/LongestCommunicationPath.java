public class LongestCommunicationPath {
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    private int diameter = 0;

    public int longestCommunicationPath(Node root) {
        diameter = 0;
        heightAndUpdateDiameter(root);
        return diameter;
    }

    private int heightAndUpdateDiameter(Node node) {
        if (node == null) return -1;
        int leftHeight = heightAndUpdateDiameter(node.left);
        int rightHeight = heightAndUpdateDiameter(node.right);

        diameter = Math.max(diameter, leftHeight + rightHeight + 2);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}