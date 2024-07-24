package org.Leetcode.LeetCode;

public class Rotate_Array {
    public static void main(String[] args) {
        Rotate_Array obj = new Rotate_Array();
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        obj.rotate(array, k);
        
       

    }

    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n; // Ensure k is within the range of the array size
        if (k == 0) {
            return;
        }

        int[] temp = new int[n];
        
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}
