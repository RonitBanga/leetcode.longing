// 349. Intersection of Two Arrays

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums = new HashSet<>();
        Set<Integer> soln = new HashSet<>();
        for(int i=0; i<nums1.length; i++) {
            nums.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++) {
            if(nums.contains(nums2[i])) {
                soln.add(nums2[i]);
            }
        }
        int n = soln.size();
        int[] arr = new int[n];
        int i = 0;
        for(Integer e : soln) {
            arr[i++] = e;
        } 
        return arr;
    }
}