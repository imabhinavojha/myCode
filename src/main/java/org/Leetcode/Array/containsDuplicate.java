package org.Leetcode.Array;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public static void main(String[] args) {
        containsDuplicate obj = new containsDuplicate();
        int[] arr = { 1, 2, 3, 1 };
        boolean value = obj.containsDuplicate1(arr);
        System.out.println(value);

    }

    public boolean containsDuplicate1(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public boolean containsDuplicate(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count >= 1) {
                return true;
            }
            count = 0;
        }
        return false;

    }

}
