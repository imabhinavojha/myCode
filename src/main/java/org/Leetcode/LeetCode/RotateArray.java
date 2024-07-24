package org.Leetcode.LeetCode;

import java.util.Collections;
import java.util.Stack;

public class RotateArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		// 7123456
		// 6712345
		// 5671234
		int k = 3;
		rotate(nums, k);

	}

	static void rotate(int[] nums, int k) {
		if (k > nums.length) {
			k = k % nums.length;
			System.out.println(" "+k);
		}

		int[] result = new int[nums.length];
		int j = 0;
		for (int i = k; i < nums.length; i++) {
			result[i] = nums[j];
			j++;
		}

		for (int i = 0; i < k; i++) {
			result[i] = nums[j];
			j++;

		}
for (int i : result) {
	System.out.print (" "+i);
}		System.arraycopy(result, 0, nums, 0, nums.length);

	}

}
