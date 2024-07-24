package org.Leetcode.Array;

public class maximumSubarray {
    public static void main(String[] args) {
        int num[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        maximumSubarray obj = new maximumSubarray();
        obj.maxSubArray(num);

    }

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxSum = nums[0]; // Initialize maxSum to the first element of the array
        int currentSum = nums[0]; // Initialize currentSum to the first element of the array
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update currentSum to either the current element or the sum of the current element and the previous sum
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update maxSum to the maximum of maxSum and currentSum
            maxSum = Math.max(maxSum, currentSum);
        }
        
        System.out.println(maxSum);
        return maxSum;

    }

}
