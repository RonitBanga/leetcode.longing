// 1457. Pseudo-Palindromic Paths in a Binary Tree

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
    int result = 0;

    void solve(TreeNode root, int[] count) {
        if(root==null) return;

        count[root.val]++;

        if(root.left==null && root.right==null) {
            int odd = 0;
            for(int i=0; i<10; i++) {
                if(count[i]%2 != 0) odd++;
            }
            if(odd<=1) result++;
        }

        solve(root.left, count);
        solve(root.right, count);

        count[root.val]--;
    }

    public int pseudoPalindromicPaths (TreeNode root) {
        int arr[] = new int[10];
        solve(root, arr);
        return result;
    }
}