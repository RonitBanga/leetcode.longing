// 2997. Minimum Number of Operations to Make Array XOR Equal to K

class Solution {
    public int minOperations(int[] nums, int k) {
        int totalXor = 0;
        for (int num : nums) {
            totalXor ^= num;
        }
        
        int diff = (totalXor ^ k);
        return Integer.bitCount(diff);
    }
}