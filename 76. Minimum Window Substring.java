// 76. Minimum Window Substring

class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();

        if(t.length() > n) return "";

        Map<Character, Integer> map = new HashMap<>();

        for(Character c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int requiredCount = t.length();
        int i=0, j=0;

        int windowSize = Integer.MAX_VALUE;
        int starti = 0;

        while(j<n) {
            char c = s.charAt(j);

            if(map.containsKey(c)==true && map.get(c)>0) {
                requiredCount--;
            }

            map.put(c, map.getOrDefault(c, 0)-1);

            while(requiredCount == 0) {
                int curWindowSize = j-i+1;
                if(curWindowSize < windowSize) {
                    windowSize = curWindowSize;
                    starti = i;
                } 

                char charAt_i = s.charAt(i);
                map.put(charAt_i, map.getOrDefault(charAt_i, 0)+1);
                if(map.get(charAt_i)>0) requiredCount++;

                i++;
            }
            
            j++;
        }

        return windowSize == Integer.MAX_VALUE ? "" : s.substring(starti, starti + windowSize);
    }
}