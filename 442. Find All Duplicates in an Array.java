// 442. Find All Duplicates in an Array

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // Hashmap
        // By Sorting
        // Using set
        
        // Best method
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            int id = Math.abs(nums[i]);
            if(nums[id-1]<0){
                arr.add(id);
            }else {
                nums[id-1] = -nums[id-1];
            }
        }
        
        return arr;
    }
}