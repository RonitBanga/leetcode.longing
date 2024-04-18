// 988. Smallest String Starting From Leaf


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
    String result= "";

    public void solveDFS(TreeNode root, String curr) {
        if(root==null) {
            return;
        }

        curr = (char)(root.val + 'a') + curr;

        if (root.left==null && root.right==null) {
            if(result=="" || result.compareTo(curr) > 0) result = curr;
            return;
        }

        solveDFS(root.right, curr);
        solveDFS(root.left, curr);
    }

    public String smallestFromLeaf(TreeNode root) {
        solveDFS(root, "");
        return result;
    }
}