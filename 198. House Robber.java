// 198. House Robber

class Solution {
    int richieRich(int ind, int[] nums, int[] dp) {
        if(ind==0) return dp[ind] = nums[0];
        if(ind<0) return 0;

        if(dp[ind] != -1) return dp[ind];

        int p = richieRich(ind-2, nums, dp) + nums[ind];
        int np = richieRich(ind-1, nums, dp);

        return dp[ind] = Math.max(p, np);

    }

    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        return richieRich(n-1, nums, dp);
    }
}

/*
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i=2; i<n; i++) {
            int temp = nums[i] + dp[i-2];
            dp[i] = Math.max(temp, dp[i-1]);
        }

        return dp[n-1];
    }
}
*/