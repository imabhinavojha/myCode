package org.Leetcode.LeetCode;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] array = new int[]{0,0,1,1,1,1,2,3,3};
        Remove_Duplicates_from_Sorted_Array obj = new Remove_Duplicates_from_Sorted_Array();
        obj.remove3Duplicates(array);
    }
    
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

         int count = 1; // Counter for unique elements
        int j = 1;     // Pointer for the updated array

        for (int i = 1 ; i < nums.length ; i++) {
            if (nums[i]!=nums[i-1]) {
                nums[j] = nums[i];
                j++;
                count++;
            }
            
        }

        System.out.println("asdfsdf : "+count);
        return count;      
    }

    public int remove3Duplicates(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (count < 2 || num > nums[count - 2]) {
                nums[count] = num;
                count++;
            }
        }
        System.out.println("dfmsklfb "+count);
        return count;
    }
}
