// 1609. Even Odd Tree

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
    private List<Integer> levelPrev = new ArrayList<>();

    public boolean isEvenOddTree(TreeNode root) {
        return solve(root, 0);
    }

    private boolean solve(TreeNode root, int level) {
        if (root == null) {
            return true;
        }

        if ((level % 2 == 0 && root.val % 2 == 0) || (level % 2 != 0 && root.val % 2 != 0)) {
            return false;
        }

        if (level >= levelPrev.size()) {
            levelPrev.add(root.val);
        } else {
            if ((level % 2 == 0 && root.val <= levelPrev.get(level)) ||
                (level % 2 != 0 && root.val >= levelPrev.get(level))) {
                return false;
            }
            levelPrev.set(level, root.val);
        }

        return solve(root.left, level + 1) && solve(root.right, level + 1);
    }
}