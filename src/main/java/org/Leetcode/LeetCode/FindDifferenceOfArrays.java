package org.Leetcode.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifferenceOfArrays {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 3 };
        int[] nums2 = { 1, 1, 2, 2 };
        List<List<Integer>> result = findDifference(nums1, nums2);
        System.out.println(result);
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> missingIn1 = new ArrayList<>();
        List<Integer> missingIn2 = new ArrayList<>();

        // Convert nums1 and nums2 to sets for efficient lookup
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }


        // Find elements in nums1 not in nums2
        for (int num : set1) {
            if (!set2.contains(num)) {
                missingIn1.add(num);
            }
        }

        // Find elements in nums2 not in nums1
        for (int num : set2) {
            if (!set1.contains(num)) {
                missingIn2.add(num);
            }
        }

        result.add(missingIn1);
        result.add(missingIn2);

        return result;
    }

}
