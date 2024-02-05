// 387. First Unique Character in a String

class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        for(Character c : s.toCharArray()) {
            freq[c-'a']++;
        }
        for(int i=0; i<s.length(); i++) {
            if(freq[s.charAt(i)-'a']==1) {
                return i;
            }
        }
        return -1;
    }
}