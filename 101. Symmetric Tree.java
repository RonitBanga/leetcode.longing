// 101. Symmetric Tree

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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;

        TreeNode l = root.left;
        TreeNode r = root.right;

        return check(l, r);
    }

    public boolean check(TreeNode l, TreeNode r) {
        if(l==null && r==null) return true;
        if(l==null || r==null) return false;
        if((l.val==r.val) && check(l.left, r.right) && check(l.right, r.left)) return true;

        return false;
    }
}