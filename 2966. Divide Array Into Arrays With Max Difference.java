// 2966. Divide Array Into Arrays With Max Difference

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int arr[][] = new int[nums.length/3][3];
        // int tem[][] = {};
        for(int i=0; i<nums.length; i+=3) {
            if(nums[i+1]-nums[i]<=k && nums[i+2]-nums[i+1]<=k) {
                int temp[] = {nums[i], nums[i+1], nums[i+2]};
                arr[i/3] = temp;
            }else{
                // return tem;
                return new int[0][0];
            }
        }
        return arr;
    }
}