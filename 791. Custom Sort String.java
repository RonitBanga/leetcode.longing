// 791. Custom Sort String

public class Solution {
    public String customSortString(String order, String str) {
        int[] count = new int[26];
        for (char x : str.toCharArray())
            count[x-'a']++;
        StringBuilder soln = new StringBuilder();
        for (char ch : order.toCharArray()) {
            while (count[ch-'a']-- > 0) {
                soln.append(ch);
            }
        }
        for (char ch : str.toCharArray()) {
            if (count[ch-'a'] > 0) {
                soln.append(ch);
            }
        }
        return soln.toString();
    }
}