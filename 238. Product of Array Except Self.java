// 238. Product of Array Except Self

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int count = 0;
        int ind = -1;
        int x = 1;
        
        for(int i=0; i<n; i++) {
            if(nums[i]==0){
                count++;
                ind = i;
                continue; 
            } 
            x *= nums[i];
        }
        
        int arr[] = new int[n]; 
        Arrays.fill(arr, 0);
        
        if(count>1){
            return arr;
        }else if(count==0){
            for(int i=0; i<n; i++) {
                if(ind==i) continue;
                else arr[i]=x/nums[i];
            }
        }else{
            for(int i=0; i<n; i++) {
                if(ind==i) arr[i]=x;
                else continue;
            }
            
        }
        
        
        return arr;
    }
}