// 42. Trapping Rain Water

class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1; 
        int leftMax = -1, rightMax = -1; 
        int water = 0; 

        while (l < r) {
            leftMax = Math.max(leftMax, height[l]); 
            rightMax = Math.max(rightMax, height[r]);

            if (leftMax < rightMax)
                water += leftMax - height[l++];
            else
                water += rightMax - height[r--];
        }
        return water; 
    }
}