// 977. Squares of a Sorted Array

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] soln = new int[n];
        for(int i=0; i<n; i++) {
            soln[i] = nums[i]*nums[i];
        }
        Arrays.sort(soln);
        return soln;
    }
}