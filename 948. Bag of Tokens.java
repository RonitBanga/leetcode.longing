// 948. Bag of Tokens

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n = tokens.length;
        int maxi = 0;
        int i=0, j=n-1;

        int score = 0;
        while(i<=j) {
            if(power >= tokens[i]) {
                score++;
                power -= tokens[i]; 
                i++;
                maxi = Math.max(maxi, score);
            }else if(score >= 1) {
                power += tokens[j];
                j--;
                score--;
            }else {
                return maxi;
            }
        }

        return maxi;
    }
}