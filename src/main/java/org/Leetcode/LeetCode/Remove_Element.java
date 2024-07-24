package org.Leetcode.LeetCode;

import java.util.ArrayList;

public class Remove_Element {
    public static void main(String[] args) {
        int num[] = new int[]{0,1,2,2,3,0,4,2} ;
        int k = 2;
        Remove_Element obj = new Remove_Element();
        obj.removeElement(num, k);
        
    }
    
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> result = new ArrayList<>();
        int count=0;
        for (Integer integer : nums) {
            if (integer!=val) {
                result.add(integer);
            }
            
        }

        count = result.size();
        System.out.println(count);
        return count;
    }

    public int removeElement1(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        System.out.println(i);
        return i;
    }
}
