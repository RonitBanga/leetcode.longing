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

// Approach 2

class Solution {
    int count;

    void palin(String s, int i, int j, int n) {
        while(i>=0 && j<n && s.charAt(i)==s.charAt(j)) {
            count++;
            i--;
            j++;
        }
    }

    public int countSubstrings(String s) {
        int n = s.length();
        count = 0;
    

    for(int i=0; i<n; i++) {
        palin(s, i, i, n);
        palin(s, i, i+1, n);
    }

    return count;
    }
}

// Approach 3

class Solution {
    public int countSubstrings(String s) {
        int n = s.length();

        boolean dp[][] = new boolean[n][n];

        int count = 0;

        for(int L=1; L<=n; L++) {
            for(int i=0; i+L<=n; i++) {
                int j = i+L-1;

                if(i==j) {
                    dp[i][j] = true;
                }else if(i+1==j) {
                    dp[i][j] = (s.charAt(i)==s.charAt(j));
                }else {
                    dp[i][j] = (s.charAt(i)==s.charAt(j) && dp[i+1][j-1]);
                }

                if(dp[i][j]==true) count++;
            }
        }

        return count;
    }
}