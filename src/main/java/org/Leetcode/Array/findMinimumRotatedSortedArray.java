package org.Leetcode.Array;

public class findMinimumRotatedSortedArray {
    public static void main(String[] args) {
        findMinimumRotatedSortedArray obj = new findMinimumRotatedSortedArray();
        int[] arr = { 11,13,15,17 };
        obj.findMin(arr);

    }

    public int findMin(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int j = 0; j < nums.length; j++) {
            if (min > nums[j]) {
                min = nums[j];
            } else if (max < nums[j]) {
                max = nums[j];
            }

        }
        System.out.println(min+" "+max);
        return min;
    }

}
