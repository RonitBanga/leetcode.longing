// 205. Isomorphic Strings

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int arr1[] = new int[256];
        int arr2[] = new int[256];
        Arrays.fill(arr1, -1);
        Arrays.fill(arr2, -1);

        for(int i=0; i<s.length(); i++) {
            int char1 = s.charAt(i);
            int char2 = t.charAt(i); 

            if((arr1[char1] != -1 && arr1[char1] != char2) || (arr2[char2] != -1 && arr2[char2] != char1)) return false;

            arr1[char1] = char2;
            arr2[char2] = char1;
        }

        return true;
    }
}