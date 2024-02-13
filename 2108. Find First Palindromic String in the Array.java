// 2108. Find First Palindromic String in the Array

class Solution {
    boolean isPalindrom(String s) {
        int j = s.length()-1;
        int i = 0;
        while(i<j) {
            if(s.charAt(i++)!=s.charAt(j--)) {
                return false;
            } 
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        int n =  words.length;
        for(int i=0; i<n; i++) {
            if(isPalindrom(words[i])) return words[i];
        }
        return "";
    }
}