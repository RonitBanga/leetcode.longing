// 1291. Sequential Digits

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> soln = new ArrayList<Integer>();

        for(int i=1; i<=9; i++) {
            int num = i;
            int numu = i+1;
            while(num<=high && numu<=9) {
                num = num*10 + numu;
                if(num>=low && num<=high) soln.add(num);
                ++numu;
            }

        }

        soln.sort(null);
        return soln;
    }
}