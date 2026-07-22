/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   static boolean identical(TreeNode a,TreeNode b){
        if(a==null && b==null)return true;
        if(a==null || b==null)return false;
        return a.val==b.val && identical(a.left,b.left) && identical(a.right,b.right);
    }
    public static boolean isSubtree(TreeNode T, TreeNode S) {
        // add code here.
        if(S==null)return true;
        if(T==null)return false;
        if(identical(T,S))return true;
        
        return isSubtree(T.left,S)|| isSubtree(T.right,S);
        
    }
}