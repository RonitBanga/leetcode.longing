// 2444. Count Subarrays With Fixed Bounds

class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long soln = 0;

        int minKP = -1;
        int maxKP = -1;
        int x = -1;

        for(int i=0; i<nums.length; i++) {
            int k = nums[i];
            if(k>maxK || k<minK) x = i;
            if(k == maxK) maxKP = i;
            if(k == minK) minKP = i;

            long smaller = Math.min(minKP, maxKP);
            long temp = smaller - x;

            soln += temp <= 0 ? 0 : temp;
        }

        return soln;
    }
}