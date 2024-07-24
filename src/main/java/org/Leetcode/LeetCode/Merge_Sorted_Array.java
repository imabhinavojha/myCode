package org.Leetcode.LeetCode;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] intArray1 = new int[] { 1, 2, 3, 0, 0, 0};
        int[] intArray2 = new int[] { 4, 5, 6 };
        int intArray1Size = 3;
        int intArray2Size = 3;
        Merge_Sorted_Array msa = new Merge_Sorted_Array();
        msa.merge(intArray1,intArray1Size,intArray2,intArray2Size);

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for the merged array
    
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        for (int l : nums1) {
            System.out.print(" "+l+" ");
            
        }
    }
}
