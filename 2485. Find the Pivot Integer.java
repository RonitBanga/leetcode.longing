// 2485. Find the Pivot Integer

class Solution {
    public int pivotInteger(int n) {
        for(int i=1; i<=n; i++) {
            int a = i*(i+1)/2;
            int b = n*(n+1)/2 - a + i;
            if(a==b) return i;
        }
        return -1;
    }
}