package org.Leetcode.Array;

public class containerWithMostWater {
    public static void main(String[] args) {
        containerWithMostWater obj = new containerWithMostWater();
        int [] arr ={1,8,6,2,5,4,8,3,7};
        obj.maxArea(arr);
    }
    
    public int maxArea(int[] height) {

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            // Calculate area between the lines
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer with the shorter line towards the center
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxArea);
        return maxArea;
        
    }
}
