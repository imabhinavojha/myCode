package org.Leetcode.Array;

public class medianOfTwoSortedArray {
    public static void main(String[] args) {
        medianOfTwoSortedArray obj = new medianOfTwoSortedArray();
        int [] nums1 = {1,3}; 
        int []  nums2 = {2}; 
        obj.findMedianSortedArrays(nums1,nums2);

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;

        if (totalLength % 2 == 0) {
            return (findKthElement(nums1, nums2, totalLength / 2) + findKthElement(nums1, nums2, totalLength / 2 + 1))/ 2.0;
        } else {
            return findKthElement(nums1, nums2, totalLength / 2 + 1);
        }
    }

    private int findKthElement(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;
        int index1 = 0;
        int index2 = 0;

        while (true) {
            if (index1 == m) {
                return nums2[index2 + k - 1];
            }
            if (index2 == n) {
                return nums1[index1 + k - 1];
            }
            if (k == 1) {
                return Math.min(nums1[index1], nums2[index2]);
            }

            int newIndex1 = Math.min(index1 + k / 2 - 1, m - 1);
            int newIndex2 = Math.min(index2 + k / 2 - 1, n - 1);

            if (nums1[newIndex1] <= nums2[newIndex2]) {
                k -= (newIndex1 - index1 + 1);
                index1 = newIndex1 + 1;
            } else {
                k -= (newIndex2 - index2 + 1);
                index2 = newIndex2 + 1;
            }
        }
    }

}
