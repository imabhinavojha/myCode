package org.Leetcode.LeetCode;

public class Two_sum {

	public static void main(String[] args) {
		int nums[] = {2,11,8,1};
		int target = 9;
		
		twoSum(nums, target);

	}

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			 for (int j = i + 1; j < nums.length; j++){
			        if (nums[i] + nums[j] == target){
			            return new int[] { i, j };

			        }
			    }
		}
		return nums;
	}

}
