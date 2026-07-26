import java.util.HashSet;
import java.util.Set;

public class TwoSumBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean findTarget(TreeNode root, int k) {
        return find(root, k, new HashSet<>());
    }

    private boolean find(TreeNode node, int k, Set<Integer> seen) {
        if (node == null) return false;
        if (seen.contains(k - node.val)) return true;
        seen.add(node.val);
        return find(node.left, k, seen) || find(node.right, k, seen);
    }
}