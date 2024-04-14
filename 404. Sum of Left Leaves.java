// 404. Sum of Left Leaves

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
    // public int solve(TreeNode curr, TreeNode parent) {
    //     if(curr == null) return 0;
    //     if(curr.left == null && curr.right == null) {
    //         if(parent != null && parent.left == curr) {
    //             return curr.val;
    //         }
    //     }
    //     int left = solve(curr.left, curr);
    //     int right = solve(curr.right, curr);

    //     return left + right;
    // }

    // public int sumOfLeftLeaves(TreeNode root) {
    //     return solve(root, null);
    // }

    public int solve(TreeNode curr, boolean bool) {
        if(curr == null) return 0;
        if(curr.left == null && curr.right == null && bool == true) {
            return curr.val;
        }
        int left = solve(curr.left, true);
        int right = solve(curr.right, false);

        return left + right;
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return solve(root, false);
    }
}