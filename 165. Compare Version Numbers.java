// 165. Compare Version Numbers

class Solution {
    public int compareVersion(String version1, String version2) {
        int l1 = version1.length();
        int l2 = version2.length();
        
        int t1 = 0;
        int t2 = 0;
        
        int i = 0;
        int j = 0;
        
        while(i<l1 || j<l2) {
            t1 = 0;
            t2 = 0;
            while(i<l1 && version1.charAt(i) != '.') {
                // String s1 = Character.toString(version1.charAt(i++));
                // String s1 = String.valueOf(version1.charAt(i++));
                String s1 = "" + version1.charAt(i++);
                t1 = t1*10 + Integer.parseInt(s1);
            }
            while(j<l2 && version2.charAt(j) != '.') {
                t2 = t2*10 + version2.charAt(j++)-'0';
            }
            
            if(t1>t2){
                return 1;
            }else if(t1<t2) {
                return -1;
            }else{
                i++;
                j++;
            }
        }
        return 0;
    }
}