// 113. Path Sum II

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
    List<List<Integer>> soln = new ArrayList<List<Integer>>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> arr = new ArrayList<>();
        helper(root, 0, arr, targetSum);
        return soln;
    }

    public void helper(TreeNode root, int sum, List<Integer> arr, int targetSum) {
        if(root==null) return;

        sum += root.val;
        arr.add(root.val);

        if(root.left==null && root.right==null && sum==targetSum) {
            soln.add(new ArrayList<>(arr));
        }else {
            helper(root.left, sum, arr, targetSum);
            helper(root.right, sum, arr, targetSum);
        }
        arr.remove(arr.size()-1);
        return;
    }
}