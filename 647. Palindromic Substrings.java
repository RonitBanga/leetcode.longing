// 647. Palindromic Substrings

class Solution {
    int dp[][] = new int[1001][1001];

    boolean palin(String s, int i, int j) {
        if(i>j) {
            return true;
        }

        if(dp[i][j] != -1) return dp[i][j]==1 ? true : false;
        
        if(s.charAt(i)==s.charAt(j)) {
            dp[i][j] = palin(s, i+1, j-1)==true ? 1 : 0;
            return dp[i][j]==1 ? true : false;
        }

        dp[i][j] = 0;
        return false;
    }

    public int countSubstrings(String s) {
        int n = s.length();

        int count = 0;

        for(int i=0; i<=n; i++) {
            Arrays.fill(dp[i], -1);    
        }

        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                if(palin(s, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }
}