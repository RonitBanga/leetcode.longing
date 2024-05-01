// 2000. Reverse Prefix of Word

class Solution {
    // public String reversePrefix(String word, char ch) {
    //     int n = word.length();
    //     String str = "";
    //     for(int i=0; i<n; i++) {
    //         char c = word.charAt(i);
    //         if(c==ch) {
    //             str = c + str;
    //             word = str + word.substring(i+1);
    //             break;
    //         }
    //         str = c + str;
    //     }
    //     return word;
    // }

    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch)+1;
		StringBuffer rev = new StringBuffer(word.substring(0, idx));
		return rev.reverse()+word.substring(idx);
    }
}